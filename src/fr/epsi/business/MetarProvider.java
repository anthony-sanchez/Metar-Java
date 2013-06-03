/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.business;

import fr.epsi.jaxb_binding.METAR;
import fr.epsi.jaxb_binding.Response;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Antho
 */
public class MetarProvider {

    private JAXBContext _jc;
    private Unmarshaller _unmarshal;
    private static final String STRURL1 = "http://weather.aero/dataserver_current/httpparam?dataSource=metars&requestType=retrieve&format=xml&stationString=";
    private static final String STRURL2 = "&hoursBeforeNow=2";
    private URL _url;

    public MetarProvider() {
        try {
            _jc = JAXBContext.newInstance("fr.epsi.jaxb_binding");
            _unmarshal = _jc.createUnmarshaller();
        } catch (JAXBException ex) {
            Logger.getLogger(MetarProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String UrlBuilder(String station) {
        return STRURL1 + station + STRURL2;
    }

    public MetarInfo BuildMetar(String station) {
        MetarInfo metarInfo = null;
        try {
            _url = new URL(UrlBuilder(station));
            Response testRep = (Response) _unmarshal.unmarshal(_url.openStream());
            if (testRep.getData().getMETAR().size() > 0) {
                METAR metar = (METAR) testRep.getData().getMETAR().get(0);
                metarInfo = new MetarInfo(metar.getTempC(), metar.getWindDirDegrees(), metar.getWindSpeedKt(), metar.getSkyCondition().size() > 0 ? metar.getSkyCondition().get(0).getSkyCover() : "off", metar.getElevationM(), station, metar.getDewpointC(), metar.getObservationTime());
            }
        } catch (IOException ex) {
            Logger.getLogger(MetarProvider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(MetarProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return metarInfo;
    }
}
