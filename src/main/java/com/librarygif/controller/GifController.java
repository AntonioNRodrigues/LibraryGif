package com.librarygif.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @RequestMapping ("/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping (value = "/gif")
    @ResponseBody
    public String listGif(){
        return "The Gif !!";
    }

    @RequestMapping(value = "/index")
    @ResponseBody
    public String home() {
        return "Hello, Contact Manager!";
    }
}
