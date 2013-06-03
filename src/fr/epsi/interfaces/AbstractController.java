/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.interfaces;

import fr.epsi.metar_codes.Stations;
import java.awt.Image;
import java.util.List;

/**
 *
 * @author Antho
 */
public interface AbstractController {

    public void setStation(String station);

    public boolean hasMorePhoto();

    public boolean hasPreviousPhoto();

    public Image getPreviousPhoto();

    public Image getNextPhoto();

    public Image getFirstPhoto(String city);

    public List<Stations.Station> getListMetar();
}
