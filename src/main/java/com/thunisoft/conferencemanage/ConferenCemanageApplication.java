package com.thunisoft.conferencemanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ConferenCemanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenCemanageApplication.class, args);
    }

}
