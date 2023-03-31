package br.com.payget.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomePageController {


    public String home(){
        return "Bem vindo";
    }

}
