package src;

import com.fasterxml.jackson.databind.ObjectMapper;
import src.dto.CurrentWeather;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by takunaka on 21.06.17.
 */
public class WeatherParser {

    public static String city;
    public static Config config = new Config();

    public static void main(String[] args) throws Exception {

        BufferedReader cityReqest = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter city name:");
        city = cityReqest.readLine();

        StringBuilder sb;

        while (!city.toLowerCase().equals("exit")) {
            try {

                URL wheatherUrl = new URL(config.getUrl() + city + "&units=metric&APPID=" + config.getApiKey());
                URLConnection connection = wheatherUrl.openConnection();
                BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                sb = new StringBuilder();
                String inputline;
                while ((inputline = response.readLine()) != null) {
                    sb.append(inputline);
                }
                response.close();
            } catch (Exception e) {
                System.out.println("Oops, something went wrong. Try again." + "\n" + "Enter city name:");
                continue;
            }

            ObjectMapper objectMapper = new ObjectMapper();
            CurrentWeather cityWeather = objectMapper.readValue(sb.toString(), CurrentWeather.class);
            cityWeather.printWeather();
            System.out.println("Enter city name");
            city = cityReqest.readLine();
        }

        cityReqest.close();
    }
}
