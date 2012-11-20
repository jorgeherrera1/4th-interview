package com.fourthsource.interview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourthsource.interview.model.Difficulty;

@Controller
public class InterviewController {
    
    @RequestMapping(value = "/difficulties", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Difficulty[] getDifficulties() {
        return Difficulty.values();
    }
    
}
