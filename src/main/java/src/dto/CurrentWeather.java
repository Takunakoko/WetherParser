package src.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import src.Config;
import src.WeatherParser;
import src.dto.*;

import java.text.SimpleDateFormat;

/**
 * Created by takunaka on 21.06.17.
 */

public class CurrentWeather {
    @JsonProperty("coord")
    private Coord coord;
    @JsonIgnore
    private String weather;
    @JsonIgnore
    private String base;
    @JsonProperty("main")
    private Main mainTemp;
    @JsonIgnore
    private double visibility;
    @JsonIgnore
    private String wind;
    @JsonIgnore
    private int clouds;
    @JsonIgnore
    private String rain;
    @JsonIgnore
    private String snow;
    @JsonIgnore
    private String dt;
    @JsonProperty("sys")
    private Sys sys;
    @JsonIgnore
    private long id;
    @JsonIgnore
    private String name;
    @JsonIgnore
    private int cod;

    public static SimpleDateFormat sunriseT = new SimpleDateFormat("HH:mm");
    public static SimpleDateFormat sunsetT = new SimpleDateFormat("HH:mm");


    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMainTemp() {
        return mainTemp;
    }

    public void setMainTemp(Main mainTemp) {
        this.mainTemp = mainTemp;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getSnow() {
        return snow;
    }

    public void setSnow(String snow) {
        this.snow = snow;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }


    public void printWeather() {
        StringBuilder sb = new StringBuilder();
        sb.append("Weather in " + WeatherParser.city + "\n");
        sb.append("Longitude: " + coord.getLon() + ", Latitude: " + coord.getLat() + "\n");
        sb.append("Temperature: " + mainTemp.getTemperature() + "\n");
        sb.append("Pressure: " + mainTemp.getPressure() + "\n");
        sb.append("Country: " + sys.getCountry() + "\n");
        sb.append("Sunrise: " + sunriseT.format(sys.getSunrise() * 1000) + "\n");
        sb.append("Sunset: " + sunsetT.format(sys.getSunset() * 1000) + "\n");

        System.out.println(sb);
    }
}
