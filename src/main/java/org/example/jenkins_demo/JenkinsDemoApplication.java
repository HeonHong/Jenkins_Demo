package org.example.jenkins_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsDemoApplication {

    @RequestMapping("/")
    public String home() {
        return "Docker Changed by Webhook";
    }

    @RequestMapping("/again")
    public String recheck() {
        return "Jenkins Testing";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
