package fr.epsi.business;

/**
 *
 * @author Antho
 */
public class MetarInfo {

    private Float _temperature;
    private Integer _windDirectionDegrees;
    private Integer _windSpeed;
    private String _skyCover;
    private Float _elevation;
    private String _station;
    private Float _dewpoint;
    private String _observationTime;

    public MetarInfo(Float temp, Integer windDir, Integer windSpd, String skyCover, Float elevation, String station, Float dewpoint, String observationTime) {
        this._temperature = temp;
        this._windDirectionDegrees = windDir;
        this._windSpeed = windSpd;
        this._skyCover = skyCover;
        this._elevation = elevation;
        this._station = station;
        this._dewpoint = dewpoint;
        this._observationTime = observationTime;
    }

    public String getObservationTime() {
        return _observationTime;
    }

    public void setObservationTime(String _observationTime) {
        this._observationTime = _observationTime;
    }

    public Float getDewpoint() {
        return _dewpoint;
    }

    public void setDewpoint(Float _dewpoint) {
        this._dewpoint = _dewpoint;
    }

    public MetarInfo() {
        
    }

    public Float getTemperature() {
        return _temperature;
    }

    public void setTemperature(Float _temperature) {
        this._temperature = _temperature;
    }

    public Integer getWindDirectionDegrees() {
        return _windDirectionDegrees;
    }

    public void setWindDirectionDegrees(Integer _windDirectionDegrees) {
        this._windDirectionDegrees = _windDirectionDegrees;
    }

    public Integer getWindSpeed() {
        return _windSpeed;
    }

    public void setWindSpeed(Integer _windSpeed) {
        this._windSpeed = _windSpeed;
    }

    public String getSkyCover() {
        return _skyCover;
    }

    public void setSkyCover(String _skyCover) {
        this._skyCover = _skyCover;
    }

    public Float getElevation() {
        return _elevation;
    }

    public void setElevation(Float _elevation) {
        this._elevation = _elevation;
    }

    public String getStation() {
        return _station;
    }

    public void setStation(String _station) {
        this._station = _station;
    }
}
