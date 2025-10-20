package se.mojujo.ee_lektion3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @GetMapping("/sayHelloAPI")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/fetchAPI")
    public String fetchAPI(){
        String uri = "https://api.open-meteo.com/v1/forecast?latitude=59.33&longitude=18.07&hourly=temperature_2m,snowfall";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
}
