//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2013.04.24 à 04:04:42 PM CEST 
//


package fr.epsi.metar_codes;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.epsi.metar_codes package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.epsi.metar_codes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Stations }
     * 
     */
    public Stations createStations() {
        return new Stations();
    }

    /**
     * Create an instance of {@link Stations.Station }
     * 
     */
    public Stations.Station createStationsStation() {
        return new Stations.Station();
    }

}
