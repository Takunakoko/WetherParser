package src.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by takunaka on 21.06.17.
 */
public class Main {

    @JsonProperty("temp") private double temperature;
    @JsonProperty("pressure") private double pressure;
    @JsonProperty("humidity") private String humidity;
    @JsonProperty("temp_min") private int tempMin;
    @JsonProperty("temp_max") private int tempMax;
    @JsonProperty("sea_level") private int seaLevel;
    @JsonProperty("grnd_level") private int grndLevel;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(int seaLevel) {
        this.seaLevel = seaLevel;
    }

    public int getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(int grndLevel) {
        this.grndLevel = grndLevel;
    }
}
