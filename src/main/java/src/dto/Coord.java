package src.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by takunaka on 21.06.17.
 */
public class Coord {
    @JsonProperty("lon") private double lon;
    @JsonProperty("lat") private double lat;


    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

}
