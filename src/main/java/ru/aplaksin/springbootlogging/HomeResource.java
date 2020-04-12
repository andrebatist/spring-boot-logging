package ru.aplaksin.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    Logger logger = LoggerFactory.getLogger(HomeResource.class);

    @RequestMapping("/")
    public String home() {
        logger.trace("Home method accessed");
        logger.info("Home info");
        //logger.error("error happened");
        return "Hello from Spring Boot";
    }
}
