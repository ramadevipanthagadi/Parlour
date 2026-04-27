package com.beauty.parlour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class ParlourApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParlourApplication.class, args);
    }

    @PostMapping("/book")
    public String book(@RequestBody BookingRequest req) {
        return "Booking Confirmed for " 
                + req.getName()
                + ", Mobile: " + req.getMobile()
                + ", Service: " + req.getService();
    }
}