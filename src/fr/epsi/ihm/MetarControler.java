/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.ihm;

import fr.epsi.business.FlickrPhotoProvider;
import fr.epsi.business.MetarInfo;
import fr.epsi.business.MetarProvider;
import fr.epsi.interfaces.AbstractController;
import fr.epsi.metar_codes.Stations;
import fr.epsi.metar_codes.Stations.Station;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Antho
 */
public class MetarControler implements AbstractController {

    private MetarProvider mprovider;
    private MetarInfo minfo;
    private MetarView mview;
    private FlickrPhotoProvider pprovider;

    public MetarControler() {
        mprovider = new MetarProvider();
        pprovider = new FlickrPhotoProvider();
    }

    public void setMview(MetarView mview) {
        this.mview = mview;
        this.mview.setListStations(getListMetar());
    }

    public void getMetarInfos(String station) {
        minfo = mprovider.BuildMetar(station);
    }

    public String dateFormat(String oldDate) {
        String returnStr = oldDate.replace("T", " ");
        returnStr = returnStr.replace("Z", "");
        return returnStr;
    }

    private String getIconSkyConditions(String skyCond) {
        String weatherLogo = null;
        switch (skyCond) {
            //FEW : few, quelques nuages, 1/8 à 2/8 du ciel couvert
            case "FEW":
                weatherLogo = "nuage_soleil";
                break;
            //SCT : scattered, épars, 3/8 à 4/8 du ciel couvert
            case "SCT":
                weatherLogo = "nuage_soleil";
                break;
            //BKN : broken, fragmenté, 5/8 à 7/8 du ciel couvert
            case "BKN":
                weatherLogo = "nuage";
                break;
            //OVC : overcast, couvert, 8/8 du ciel couvert
            case "OVC":
                weatherLogo = "nuage";
                break;
            //NSC : aucun nuage d'une hauteur inférieure à 5 000 pieds ou sous l'altitude minimale de secteur 
            case "NSC":
                weatherLogo = "nuage_soleil";
                break;
            //CAVOC : Ceiling and Visibility are OK
            case "CAVOC":
                break;
            //CB : Si des cumulonimbus ou cumulus bourgeonnants sont présents
            case "CB":
                weatherLogo = "nuage_soleil";
                break;
            //TCU : Si des cumulonimbus ou cumulus bourgeonnants sont présents
            case "TCU":
                weatherLogo = "pluie";
                break;
            //VV : Vertical Visibility, Si le ciel est obscurci par les précipitations ou le brouillard
            case "VV":
                weatherLogo = "brouillard";
                break;
            //NCD : No Clouds Detected, Si la station est automatique et aucune présence de nuages n'a pu être détectée
            case "NCD":
                weatherLogo = "nuage_soleil";
                break;
            default:
                weatherLogo = "nuage_soleil";
                break;
        }
        return weatherLogo;
    }

    public List<Station> getListMetar() {
        List<Station> list = null;
        try {
            JAXBContext jc = JAXBContext.newInstance("fr.epsi.metar_codes");
            Unmarshaller u = jc.createUnmarshaller();
            Stations stations = (Stations) u.unmarshal(new FileInputStream("src/fr/epsi/xml/ListMetarCode.xml"));
            list = stations.getStation();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MetarControler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(MetarControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void setStation(String station) {
        getMetarInfos(station);
        if (minfo != null) {
            mview.setTemperature(String.valueOf(Math.round(minfo.getTemperature())));
            mview.setSkyConditions(getIconSkyConditions(minfo.getSkyCover()));
            mview.setWindDirection(minfo.getWindDirectionDegrees().toString());
            mview.setWindSpeed(minfo.getWindSpeed().toString());
            mview.setDewpoint(minfo.getDewpoint().toString());
            mview.setObservationDate(dateFormat(minfo.getObservationTime()));
        } else {
            this.mview.razInterface();
        }
    }

    @Override
    public boolean hasMorePhoto() {
        return this.pprovider.hasMorePhoto();
    }

    @Override
    public boolean hasPreviousPhoto() {
        return this.pprovider.hasPreviousPhoto();
    }

    @Override
    public Image getPreviousPhoto() {
        return this.pprovider.getPreviousPhoto();
    }

    @Override
    public Image getNextPhoto() {
        return this.pprovider.getNextPhoto();
    }

    @Override
    public Image getFirstPhoto(String city) {
        return this.pprovider.getFirstPhoto(city, mview.getFramewidth());
    }
}
