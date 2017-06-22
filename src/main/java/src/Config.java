package src;

import java.text.SimpleDateFormat;

/**
 * Created by takunaka on 21.06.17.
 */
public class Config {

    private static String apiKey = "e0de28a8cb0fee81c2e98e66f2480232";

    private static String url = "http://api.openweathermap.org/data/2.5/weather?q=";

    public static String getApiKey() {
        return apiKey;
    }

    public static String getUrl() {
        return url;
    }


}
