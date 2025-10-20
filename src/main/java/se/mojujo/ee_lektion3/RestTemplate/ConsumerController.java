package se.mojujo.ee_lektion3.RestTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RestController
public class ConsumerController {

    @GetMapping("/sayHelloAPI")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/fetchAPI")
    public List<Object> fetchAPI(){
        String uri = "https://api.open-meteo.com/v1/forecast?latitude=59.33&longitude=18.07&hourly=temperature_2m,snowfall";
        RestTemplate restTemplate = new RestTemplate();
        WeatherModel weatherModel;

        try {
            weatherModel = restTemplate.getForObject(uri, WeatherModel.class);

            if (weatherModel != null) {
                System.out.println(weatherModel.generationtime_ms);
            }

            return Collections.singletonList(weatherModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
