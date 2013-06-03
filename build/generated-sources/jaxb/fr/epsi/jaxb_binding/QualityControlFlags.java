//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2013.04.24 � 04:04:41 PM CEST 
//


package fr.epsi.jaxb_binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}corrected" minOccurs="0"/>
 *         &lt;element ref="{}auto" minOccurs="0"/>
 *         &lt;element ref="{}auto_station" minOccurs="0"/>
 *         &lt;element ref="{}maintenance_indicator_on" minOccurs="0"/>
 *         &lt;element ref="{}no_signal" minOccurs="0"/>
 *         &lt;element ref="{}lightning_sensor_off" minOccurs="0"/>
 *         &lt;element ref="{}freezing_rain_sensor_off" minOccurs="0"/>
 *         &lt;element ref="{}present_weather_sensor_off" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "corrected",
    "auto",
    "autoStation",
    "maintenanceIndicatorOn",
    "noSignal",
    "lightningSensorOff",
    "freezingRainSensorOff",
    "presentWeatherSensorOff"
})
@XmlRootElement(name = "quality_control_flags")
public class QualityControlFlags {

    protected String corrected;
    protected String auto;
    @XmlElement(name = "auto_station")
    protected String autoStation;
    @XmlElement(name = "maintenance_indicator_on")
    protected String maintenanceIndicatorOn;
    @XmlElement(name = "no_signal")
    protected String noSignal;
    @XmlElement(name = "lightning_sensor_off")
    protected String lightningSensorOff;
    @XmlElement(name = "freezing_rain_sensor_off")
    protected String freezingRainSensorOff;
    @XmlElement(name = "present_weather_sensor_off")
    protected String presentWeatherSensorOff;

    /**
     * Obtient la valeur de la propri�t� corrected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrected() {
        return corrected;
    }

    /**
     * D�finit la valeur de la propri�t� corrected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrected(String value) {
        this.corrected = value;
    }

    /**
     * Obtient la valeur de la propri�t� auto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuto() {
        return auto;
    }

    /**
     * D�finit la valeur de la propri�t� auto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuto(String value) {
        this.auto = value;
    }

    /**
     * Obtient la valeur de la propri�t� autoStation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoStation() {
        return autoStation;
    }

    /**
     * D�finit la valeur de la propri�t� autoStation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoStation(String value) {
        this.autoStation = value;
    }

    /**
     * Obtient la valeur de la propri�t� maintenanceIndicatorOn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceIndicatorOn() {
        return maintenanceIndicatorOn;
    }

    /**
     * D�finit la valeur de la propri�t� maintenanceIndicatorOn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceIndicatorOn(String value) {
        this.maintenanceIndicatorOn = value;
    }

    /**
     * Obtient la valeur de la propri�t� noSignal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSignal() {
        return noSignal;
    }

    /**
     * D�finit la valeur de la propri�t� noSignal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSignal(String value) {
        this.noSignal = value;
    }

    /**
     * Obtient la valeur de la propri�t� lightningSensorOff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightningSensorOff() {
        return lightningSensorOff;
    }

    /**
     * D�finit la valeur de la propri�t� lightningSensorOff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightningSensorOff(String value) {
        this.lightningSensorOff = value;
    }

    /**
     * Obtient la valeur de la propri�t� freezingRainSensorOff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreezingRainSensorOff() {
        return freezingRainSensorOff;
    }

    /**
     * D�finit la valeur de la propri�t� freezingRainSensorOff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreezingRainSensorOff(String value) {
        this.freezingRainSensorOff = value;
    }

    /**
     * Obtient la valeur de la propri�t� presentWeatherSensorOff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentWeatherSensorOff() {
        return presentWeatherSensorOff;
    }

    /**
     * D�finit la valeur de la propri�t� presentWeatherSensorOff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentWeatherSensorOff(String value) {
        this.presentWeatherSensorOff = value;
    }

}
