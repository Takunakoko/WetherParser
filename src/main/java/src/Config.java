package src;

import java.text.SimpleDateFormat;

/**
 * Created by takunaka on 21.06.17.
 */
public class Config {

    private String apiKey = "e0de28a8cb0fee81c2e98e66f2480232";

    private String url = "http://api.openweathermap.org/data/2.5/weather?q=";

    public String getApiKey() {
        return apiKey;
    }

    public String getUrl() {
        return url;
    }


}
