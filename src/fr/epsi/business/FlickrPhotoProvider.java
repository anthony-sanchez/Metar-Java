package fr.epsi.business;

import fr.epsi.flickr.get_photo.Rsp;
import fr.epsi.flickr.get_photo.Rsp.Photos.Photo;
import java.awt.Image;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Use to get a Flickr Photo and manage a collection of images used by UI.
 *
 * @author Antho
 */
public class FlickrPhotoProvider {

    public static final String FLICKRSTRURL = "http://api.flickr.com/services/rest/?method=flickr.photos.search&api_key=";
    public static final String FLICKRAPIKEY = "3767867983d81286b2b1073bc05c2b85"; 
    public static final String FLICKRGROUPID = "1650740%40N23";
    private URL urlPhotoAvailable;
    private JAXBContext jc;
    private Unmarshaller unmarshal;
    private ArrayList<Photo> photoList;
    private ArrayList<Image> imageList;
    private int currentIndex;
    private int minWidth;

    /**
     *
     * @param city
     * @return
     */
    private String buildFlickerURL(String city) {
        return FLICKRSTRURL + FLICKRAPIKEY + "&tags=" + city + "&group_id=" + FLICKRGROUPID + "&format=rest";
    }

    public FlickrPhotoProvider() {
        try {
            jc = JAXBContext.newInstance("fr.epsi.flickr.get_photo");
            unmarshal = jc.createUnmarshaller();
            imageList = new ArrayList<Image>();
        } catch (JAXBException ex) {
            Logger.getLogger(FlickrPhotoProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image getFirstPhoto(String city, int minWidth) {
        Image img = null;
        this.minWidth = minWidth;
        imageList.clear();
        currentIndex = 0;
        try {
            this.urlPhotoAvailable = new URL(buildFlickerURL(city));
            System.out.println(this.urlPhotoAvailable.toString());
            urlPhotoAvailable.openStream();
            Rsp rep = (Rsp) unmarshal.unmarshal(urlPhotoAvailable.openStream());
            photoList = (ArrayList<Photo>) rep.getPhotos().getPhoto();
            if (photoList.size() > 0) {
                img = getGoodPhoto(0);
                imageList.add(img);
            }
        } catch (IOException ex) {
            Logger.getLogger(FlickrPhotoProvider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(FlickrPhotoProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img;
    }

    public boolean hasMorePhoto() {
        if (currentIndex + 1 < photoList.size() && photoList.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasPreviousPhoto() {
        if (currentIndex - 1 >= 0 && imageList.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Image getPreviousPhoto() {
        Image img = null;
        if (hasPreviousPhoto()) {
            currentIndex--;
            img = imageList.get(currentIndex);
        }
        return img;
    }

    public Image getNextPhoto() {
        Image img = null;
        if (hasMorePhoto()) {
            currentIndex++;
            if (currentIndex < imageList.size()) {
                img = imageList.get(currentIndex);
            } else {
                img = getGoodPhoto(currentIndex);
                imageList.add(img);
            }
        }
        return img;
    }

    private Image getGoodPhoto(int id) {
        Image returnedImg = getPhoto(id);

        if (returnedImg.getWidth(null) < this.minWidth) {
            boolean imgOk = false;
            int ind = id;

            while (!imgOk && ind < photoList.size() && ind < id+2) {
                if (returnedImg.getWidth(null) < this.minWidth) {
                    photoList.remove(ind);
                    returnedImg = getPhoto(ind);
                    ind++;
                } else {
                    imgOk = true;
                }
            }
        }
        return returnedImg;

    }

    private Image getPhoto(int id) {
        Image returnedImg = null;
        if (id < photoList.size()) {
            Photo p = photoList.get(id);
            String flickrurl = "http://static.flickr.com/" + p.getServer() + "/" + p.getId() + "_" + p.getSecret() + "_b.jpg";
            System.out.println(flickrurl);
            try {
                URL url = new URL(flickrurl);
                returnedImg = (ImageIO.read(url));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return returnedImg;
    }
}
