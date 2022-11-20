package com.homeWorkFive.homeWorkFive.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller("")
public class MainController {

    @GetMapping("/history")
    String getGreeting(@RequestParam String name, Model model) {
        model.addAttribute("guest_name",name);
        return "history";
    }

    @GetMapping("/")
    String getGreeting() {
        return "start";
    }

//    @GetMapping("/")
//    String getGreeting() {
//        return "Ivanchik Daniil";
//    }

}
