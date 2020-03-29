package com.EisenBoard.WebAppDev.controller;

import main.java.com.EisenBoard.WebAppDev.model.Activity;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class weeklyScheduleController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("activity", new Activity());
        return "index";
    }

    @PostMapping("/addTask")
    public String addTask(@ModelAttribute main.java.com.EisenBoard.WebAppDev.model.Activity activity) {
        activity.setActivityName(null);
        activity.setAdditionalNotes(null);
        activity.setRanking(null);
        activity.setMustBeCompletedByDate(null);
        return "index";
    }

}
