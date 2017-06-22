package src;

import com.fasterxml.jackson.databind.ObjectMapper;
import src.Config;
import src.CurrentWeather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by takunaka on 21.06.17.
 */
public class WeatherParser {


    public static void main(String[] args) throws Exception {

        BufferedReader cityReqest = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter city name");
        Config.setCity(cityReqest.readLine());

        URL wheatherUrl = new URL(Config.getUrl() + Config.getCity() + "&units=metric&APPID=" + Config.getApiKey());
        URLConnection connection = wheatherUrl.openConnection();

        BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String inputline;
        StringBuilder sb = new StringBuilder();

        while ((inputline = response.readLine()) != null){
            sb.append(inputline);
        }
        response.close();

        ObjectMapper objectMapper = new ObjectMapper();
        CurrentWeather cityWeather = objectMapper.readValue(sb.toString(), CurrentWeather.class);
        System.out.println(cityWeather);





    }
}
