package com.example.demo.rest;

import java.util.Scanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProiectController {

    @GetMapping("/start")
    public String nume(){
        return "Varzari Carolina!!!!!";
    }

}
