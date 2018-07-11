package com.example.apis.demo;

import com.example.apis.demo.model.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Greeting quote = restTemplate.getForObject("http://rest-service.guides.spring.io/greeting", Greeting.class);
        System.out.print(quote.getId() + "  " + quote.getContent());
        SpringApplication.run(DemoApplication.class, args);
    }
}
