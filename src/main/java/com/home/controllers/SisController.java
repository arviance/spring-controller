package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

    @ResponseBody
    @RequestMapping("/makeup")
    public String giveMakeupKit() {
        return "Just take my make up kit";
    }

    @RequestMapping("/book")
    @ResponseBody
    public String getBooks() {
        return "Math Book";
    }
}
