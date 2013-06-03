//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2013.04.24 � 04:04:41 PM CEST 
//


package fr.epsi.jaxb_binding;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}raw_text" minOccurs="0"/>
 *         &lt;element ref="{}station_id" minOccurs="0"/>
 *         &lt;element ref="{}observation_time" minOccurs="0"/>
 *         &lt;element ref="{}latitude" minOccurs="0"/>
 *         &lt;element ref="{}longitude" minOccurs="0"/>
 *         &lt;element ref="{}temp_c" minOccurs="0"/>
 *         &lt;element ref="{}dewpoint_c" minOccurs="0"/>
 *         &lt;element ref="{}wind_dir_degrees" minOccurs="0"/>
 *         &lt;element ref="{}wind_speed_kt" minOccurs="0"/>
 *         &lt;element ref="{}wind_gust_kt" minOccurs="0"/>
 *         &lt;element ref="{}visibility_statute_mi" minOccurs="0"/>
 *         &lt;element ref="{}altim_in_hg" minOccurs="0"/>
 *         &lt;element ref="{}sea_level_pressure_mb" minOccurs="0"/>
 *         &lt;element ref="{}quality_control_flags" minOccurs="0"/>
 *         &lt;element ref="{}wx_string" minOccurs="0"/>
 *         &lt;element ref="{}sky_condition" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{}flight_category" minOccurs="0"/>
 *         &lt;element ref="{}three_hr_pressure_tendency_mb" minOccurs="0"/>
 *         &lt;element ref="{}maxT_c" minOccurs="0"/>
 *         &lt;element ref="{}minT_c" minOccurs="0"/>
 *         &lt;element ref="{}maxT24hr_c" minOccurs="0"/>
 *         &lt;element ref="{}minT24hr_c" minOccurs="0"/>
 *         &lt;element ref="{}precip_in" minOccurs="0"/>
 *         &lt;element ref="{}pcp3hr_in" minOccurs="0"/>
 *         &lt;element ref="{}pcp6hr_in" minOccurs="0"/>
 *         &lt;element ref="{}pcp24hr_in" minOccurs="0"/>
 *         &lt;element ref="{}snow_in" minOccurs="0"/>
 *         &lt;element ref="{}vert_vis_ft" minOccurs="0"/>
 *         &lt;element ref="{}metar_type" minOccurs="0"/>
 *         &lt;element ref="{}elevation_m" minOccurs="0"/>
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
    "rawText",
    "stationId",
    "observationTime",
    "latitude",
    "longitude",
    "tempC",
    "dewpointC",
    "windDirDegrees",
    "windSpeedKt",
    "windGustKt",
    "visibilityStatuteMi",
    "altimInHg",
    "seaLevelPressureMb",
    "qualityControlFlags",
    "wxString",
    "skyCondition",
    "flightCategory",
    "threeHrPressureTendencyMb",
    "maxTC",
    "minTC",
    "maxT24HrC",
    "minT24HrC",
    "precipIn",
    "pcp3HrIn",
    "pcp6HrIn",
    "pcp24HrIn",
    "snowIn",
    "vertVisFt",
    "metarType",
    "elevationM"
})
@XmlRootElement(name = "METAR")
public class METAR {

    @XmlElement(name = "raw_text")
    protected String rawText;
    @XmlElement(name = "station_id")
    protected String stationId;
    @XmlElement(name = "observation_time")
    protected String observationTime;
    protected Float latitude;
    protected Float longitude;
    @XmlElement(name = "temp_c")
    protected Float tempC;
    @XmlElement(name = "dewpoint_c")
    protected Float dewpointC;
    @XmlElement(name = "wind_dir_degrees")
    protected Integer windDirDegrees;
    @XmlElement(name = "wind_speed_kt")
    protected Integer windSpeedKt;
    @XmlElement(name = "wind_gust_kt")
    protected Integer windGustKt;
    @XmlElement(name = "visibility_statute_mi")
    protected Float visibilityStatuteMi;
    @XmlElement(name = "altim_in_hg")
    protected Float altimInHg;
    @XmlElement(name = "sea_level_pressure_mb")
    protected Float seaLevelPressureMb;
    @XmlElement(name = "quality_control_flags")
    protected QualityControlFlags qualityControlFlags;
    @XmlElement(name = "wx_string")
    protected String wxString;
    @XmlElement(name = "sky_condition")
    protected List<SkyCondition> skyCondition;
    @XmlElement(name = "flight_category")
    protected String flightCategory;
    @XmlElement(name = "three_hr_pressure_tendency_mb")
    protected Float threeHrPressureTendencyMb;
    @XmlElement(name = "maxT_c")
    protected Float maxTC;
    @XmlElement(name = "minT_c")
    protected Float minTC;
    @XmlElement(name = "maxT24hr_c")
    protected Float maxT24HrC;
    @XmlElement(name = "minT24hr_c")
    protected Float minT24HrC;
    @XmlElement(name = "precip_in")
    protected Float precipIn;
    @XmlElement(name = "pcp3hr_in")
    protected Float pcp3HrIn;
    @XmlElement(name = "pcp6hr_in")
    protected Float pcp6HrIn;
    @XmlElement(name = "pcp24hr_in")
    protected Float pcp24HrIn;
    @XmlElement(name = "snow_in")
    protected Float snowIn;
    @XmlElement(name = "vert_vis_ft")
    protected Integer vertVisFt;
    @XmlElement(name = "metar_type")
    protected String metarType;
    @XmlElement(name = "elevation_m")
    protected Float elevationM;

    /**
     * Obtient la valeur de la propri�t� rawText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawText() {
        return rawText;
    }

    /**
     * D�finit la valeur de la propri�t� rawText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawText(String value) {
        this.rawText = value;
    }

    /**
     * Obtient la valeur de la propri�t� stationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * D�finit la valeur de la propri�t� stationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationId(String value) {
        this.stationId = value;
    }

    /**
     * Obtient la valeur de la propri�t� observationTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationTime() {
        return observationTime;
    }

    /**
     * D�finit la valeur de la propri�t� observationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationTime(String value) {
        this.observationTime = value;
    }

    /**
     * Obtient la valeur de la propri�t� latitude.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * D�finit la valeur de la propri�t� latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLatitude(Float value) {
        this.latitude = value;
    }

    /**
     * Obtient la valeur de la propri�t� longitude.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * D�finit la valeur de la propri�t� longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLongitude(Float value) {
        this.longitude = value;
    }

    /**
     * Obtient la valeur de la propri�t� tempC.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTempC() {
        return tempC;
    }

    /**
     * D�finit la valeur de la propri�t� tempC.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTempC(Float value) {
        this.tempC = value;
    }

    /**
     * Obtient la valeur de la propri�t� dewpointC.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDewpointC() {
        return dewpointC;
    }

    /**
     * D�finit la valeur de la propri�t� dewpointC.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDewpointC(Float value) {
        this.dewpointC = value;
    }

    /**
     * Obtient la valeur de la propri�t� windDirDegrees.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWindDirDegrees() {
        return windDirDegrees;
    }

    /**
     * D�finit la valeur de la propri�t� windDirDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWindDirDegrees(Integer value) {
        this.windDirDegrees = value;
    }

    /**
     * Obtient la valeur de la propri�t� windSpeedKt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWindSpeedKt() {
        return windSpeedKt;
    }

    /**
     * D�finit la valeur de la propri�t� windSpeedKt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWindSpeedKt(Integer value) {
        this.windSpeedKt = value;
    }

    /**
     * Obtient la valeur de la propri�t� windGustKt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWindGustKt() {
        return windGustKt;
    }

    /**
     * D�finit la valeur de la propri�t� windGustKt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWindGustKt(Integer value) {
        this.windGustKt = value;
    }

    /**
     * Obtient la valeur de la propri�t� visibilityStatuteMi.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVisibilityStatuteMi() {
        return visibilityStatuteMi;
    }

    /**
     * D�finit la valeur de la propri�t� visibilityStatuteMi.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVisibilityStatuteMi(Float value) {
        this.visibilityStatuteMi = value;
    }

    /**
     * Obtient la valeur de la propri�t� altimInHg.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAltimInHg() {
        return altimInHg;
    }

    /**
     * D�finit la valeur de la propri�t� altimInHg.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAltimInHg(Float value) {
        this.altimInHg = value;
    }

    /**
     * Obtient la valeur de la propri�t� seaLevelPressureMb.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSeaLevelPressureMb() {
        return seaLevelPressureMb;
    }

    /**
     * D�finit la valeur de la propri�t� seaLevelPressureMb.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSeaLevelPressureMb(Float value) {
        this.seaLevelPressureMb = value;
    }

    /**
     * Obtient la valeur de la propri�t� qualityControlFlags.
     * 
     * @return
     *     possible object is
     *     {@link QualityControlFlags }
     *     
     */
    public QualityControlFlags getQualityControlFlags() {
        return qualityControlFlags;
    }

    /**
     * D�finit la valeur de la propri�t� qualityControlFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityControlFlags }
     *     
     */
    public void setQualityControlFlags(QualityControlFlags value) {
        this.qualityControlFlags = value;
    }

    /**
     * Obtient la valeur de la propri�t� wxString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWxString() {
        return wxString;
    }

    /**
     * D�finit la valeur de la propri�t� wxString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWxString(String value) {
        this.wxString = value;
    }

    /**
     * Gets the value of the skyCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skyCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkyCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkyCondition }
     * 
     * 
     */
    public List<SkyCondition> getSkyCondition() {
        if (skyCondition == null) {
            skyCondition = new ArrayList<SkyCondition>();
        }
        return this.skyCondition;
    }

    /**
     * Obtient la valeur de la propri�t� flightCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightCategory() {
        return flightCategory;
    }

    /**
     * D�finit la valeur de la propri�t� flightCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightCategory(String value) {
        this.flightCategory = value;
    }

    /**
     * Obtient la valeur de la propri�t� threeHrPressureTendencyMb.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getThreeHrPressureTendencyMb() {
        return threeHrPressureTendencyMb;
    }

    /**
     * D�finit la valeur de la propri�t� threeHrPressureTendencyMb.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setThreeHrPressureTendencyMb(Float value) {
        this.threeHrPressureTendencyMb = value;
    }

    /**
     * Obtient la valeur de la propri�t� maxTC.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxTC() {
        return maxTC;
    }

    /**
     * D�finit la valeur de la propri�t� maxTC.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxTC(Float value) {
        this.maxTC = value;
    }

    /**
     * Obtient la valeur de la propri�t� minTC.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinTC() {
        return minTC;
    }

    /**
     * D�finit la valeur de la propri�t� minTC.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinTC(Float value) {
        this.minTC = value;
    }

    /**
     * Obtient la valeur de la propri�t� maxT24HrC.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxT24HrC() {
        return maxT24HrC;
    }

    /**
     * D�finit la valeur de la propri�t� maxT24HrC.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxT24HrC(Float value) {
        this.maxT24HrC = value;
    }

    /**
     * Obtient la valeur de la propri�t� minT24HrC.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinT24HrC() {
        return minT24HrC;
    }

    /**
     * D�finit la valeur de la propri�t� minT24HrC.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinT24HrC(Float value) {
        this.minT24HrC = value;
    }

    /**
     * Obtient la valeur de la propri�t� precipIn.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrecipIn() {
        return precipIn;
    }

    /**
     * D�finit la valeur de la propri�t� precipIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrecipIn(Float value) {
        this.precipIn = value;
    }

    /**
     * Obtient la valeur de la propri�t� pcp3HrIn.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPcp3HrIn() {
        return pcp3HrIn;
    }

    /**
     * D�finit la valeur de la propri�t� pcp3HrIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPcp3HrIn(Float value) {
        this.pcp3HrIn = value;
    }

    /**
     * Obtient la valeur de la propri�t� pcp6HrIn.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPcp6HrIn() {
        return pcp6HrIn;
    }

    /**
     * D�finit la valeur de la propri�t� pcp6HrIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPcp6HrIn(Float value) {
        this.pcp6HrIn = value;
    }

    /**
     * Obtient la valeur de la propri�t� pcp24HrIn.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPcp24HrIn() {
        return pcp24HrIn;
    }

    /**
     * D�finit la valeur de la propri�t� pcp24HrIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPcp24HrIn(Float value) {
        this.pcp24HrIn = value;
    }

    /**
     * Obtient la valeur de la propri�t� snowIn.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSnowIn() {
        return snowIn;
    }

    /**
     * D�finit la valeur de la propri�t� snowIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSnowIn(Float value) {
        this.snowIn = value;
    }

    /**
     * Obtient la valeur de la propri�t� vertVisFt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVertVisFt() {
        return vertVisFt;
    }

    /**
     * D�finit la valeur de la propri�t� vertVisFt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVertVisFt(Integer value) {
        this.vertVisFt = value;
    }

    /**
     * Obtient la valeur de la propri�t� metarType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetarType() {
        return metarType;
    }

    /**
     * D�finit la valeur de la propri�t� metarType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetarType(String value) {
        this.metarType = value;
    }

    /**
     * Obtient la valeur de la propri�t� elevationM.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getElevationM() {
        return elevationM;
    }

    /**
     * D�finit la valeur de la propri�t� elevationM.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setElevationM(Float value) {
        this.elevationM = value;
    }

}
