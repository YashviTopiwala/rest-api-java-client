import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class WeatherClient {

    public static void main(String[] args) {

        try {

            String apiURL = "https://api.open-meteo.com/v1/forecast?latitude=21.17&longitude=72.83&current_weather=true";

            URL url = new URL(apiURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            JSONObject json = new JSONObject(response.toString());

            JSONObject currentWeather = json.getJSONObject("current_weather");

            double temperature = currentWeather.getDouble("temperature");
            double windspeed = currentWeather.getDouble("windspeed");
            int windDirection = currentWeather.getInt("winddirection");

            System.out.println("Weather Report");
            System.out.println("----------------------");
            System.out.println("Location: Surat");
            System.out.println("Temperature: " + temperature + " °C");
            System.out.println("Wind Speed: " + windspeed + " km/h");
            System.out.println("Wind Direction: " + windDirection + "°");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}