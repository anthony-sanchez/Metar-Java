//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2013.04.24 � 04:04:41 PM CEST 
//


package fr.epsi.jaxb_binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sky_cover" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cloud_base_ft_agl" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sky_condition")
public class SkyCondition {

    @XmlAttribute(name = "sky_cover")
    protected String skyCover;
    @XmlAttribute(name = "cloud_base_ft_agl")
    protected Integer cloudBaseFtAgl;

    /**
     * Obtient la valeur de la propri�t� skyCover.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkyCover() {
        return skyCover;
    }

    /**
     * D�finit la valeur de la propri�t� skyCover.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkyCover(String value) {
        this.skyCover = value;
    }

    /**
     * Obtient la valeur de la propri�t� cloudBaseFtAgl.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCloudBaseFtAgl() {
        return cloudBaseFtAgl;
    }

    /**
     * D�finit la valeur de la propri�t� cloudBaseFtAgl.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCloudBaseFtAgl(Integer value) {
        this.cloudBaseFtAgl = value;
    }

}
