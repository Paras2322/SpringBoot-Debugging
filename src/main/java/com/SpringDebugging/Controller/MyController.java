package com.SpringDebugging.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/about")
    public String getAbout(){
        String str="TechArchitects By Paras Bagga";
        str=str.toLowerCase();
        str=str.toUpperCase();
        return str;
    }
}
