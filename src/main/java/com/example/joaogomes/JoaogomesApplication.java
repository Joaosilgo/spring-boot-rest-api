package com.example.joaogomes;

import com.example.joaogomes.object.Objecto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class JoaogomesApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoaogomesApplication.class, args);
    }

    @GetMapping
    public String welcome() {
        return "Welcome to Spring REST API," +  "\n" +
                "see full Doc in https://github.com/Joaosilgo/spring-boot-rest-api";
    }

}
