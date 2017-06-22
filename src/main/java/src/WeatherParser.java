package src;

import com.fasterxml.jackson.databind.ObjectMapper;
import src.dto.CurrentWeather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by takunaka on 21.06.17.
 */
public class WeatherParser {


    public static String city;
    public static void main(String[] args) throws Exception {

        BufferedReader cityReqest = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter city name:");
        city = cityReqest.readLine();

        while (!city.toLowerCase().equals("exit")) {
            URL wheatherUrl = new URL(Config.getUrl() + city + "&units=metric&APPID=" + Config.getApiKey());
            URLConnection connection = wheatherUrl.openConnection();

            BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputline;
            StringBuilder sb = new StringBuilder();

            while ((inputline = response.readLine()) != null) {
                sb.append(inputline);
            }

            response.close();

            ObjectMapper objectMapper = new ObjectMapper();
            CurrentWeather cityWeather = objectMapper.readValue(sb.toString(), CurrentWeather.class);
            cityWeather.printWeather();
            System.out.println("Enter city name");
            city = cityReqest.readLine();
        }

        cityReqest.close();

    }
}
