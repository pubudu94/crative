package com.drointec.springboot.springboot_tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pubudu on 8/18/17.
 */
@RestController
public class HelloWorld {


    @RequestMapping(value = "/")
    public String helloPage(){

        return "Hello Pubudu" ;
    }
}
