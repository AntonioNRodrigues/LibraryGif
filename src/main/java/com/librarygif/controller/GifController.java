package com.librarygif.controller;

import com.librarygif.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {

    @RequestMapping ("/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping(value = "/index")
    @ResponseBody
    public String home() {
        return "Hello, Contact Manager!";
    }

    @RequestMapping(value = "/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif ("compiler-bot", LocalDate.of(2017,10, 4), "Antonio", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
