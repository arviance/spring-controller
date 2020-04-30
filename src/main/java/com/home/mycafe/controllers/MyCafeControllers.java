package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyCafeControllers {

    //Return the welcome-page
    @RequestMapping("/cafe")
    public String showWelcomePage(Model model) {
        return "welcome-page";
    }

    @RequestMapping("/processOrder")
    public String processOrder(HttpServletRequest requset, Model model) {

        //Handle the data received from the user
        String userEnteredValue = requset.getParameter("foodType");

        //Adding the captured value to the model
        model.addAttribute("userInput", userEnteredValue);

        //Set the user data with the model object and send it to view
        return "process-order";
    }
}
