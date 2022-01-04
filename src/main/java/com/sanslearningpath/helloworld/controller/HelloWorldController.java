package com.sanslearningpath.helloworld.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

      @RequestMapping("/")
        public String hello()
        {
            log.info("Success");
            return "Hello San's Learning Path";

        }
    }
