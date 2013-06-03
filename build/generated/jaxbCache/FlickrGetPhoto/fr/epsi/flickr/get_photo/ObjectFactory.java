//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2013.04.24 à 04:04:42 PM CEST 
//


package fr.epsi.flickr.get_photo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.epsi.flickr.get_photo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.epsi.flickr.get_photo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rsp }
     * 
     */
    public Rsp createRsp() {
        return new Rsp();
    }

    /**
     * Create an instance of {@link Rsp.Photos }
     * 
     */
    public Rsp.Photos createRspPhotos() {
        return new Rsp.Photos();
    }

    /**
     * Create an instance of {@link Rsp.Photos.Photo }
     * 
     */
    public Rsp.Photos.Photo createRspPhotosPhoto() {
        return new Rsp.Photos.Photo();
    }

}
