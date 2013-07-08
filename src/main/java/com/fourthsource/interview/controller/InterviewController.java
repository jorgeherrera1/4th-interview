package com.fourthsource.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fourthsource.interview.dto.QuickInterviewDTO;
import com.fourthsource.interview.service.InterviewService;

@Controller
public class InterviewController {
    
    @Autowired
    private InterviewService interviewService;
    
    public void quickInterview(QuickInterviewDTO quickInterviewDto) {
        
    }
    
}
