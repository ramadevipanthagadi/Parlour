package com.beauty.parlour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ParlourApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParlourApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Beauty Parlour!";
    }

    @GetMapping("/services")
    public String services() {
        return "Services: Facial, Haircut, Makeup";
    }

    @GetMapping("/booking")
    public String booking() {
        return "Booking Successful!";
    }
}
