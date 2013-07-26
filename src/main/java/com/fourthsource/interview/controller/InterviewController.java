package com.fourthsource.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourthsource.interview.dto.SkillDTO;
import com.fourthsource.interview.service.InterviewService;

@Controller
public class InterviewController {
    
    @Autowired
    private InterviewService interviewService;
    
    @RequestMapping(value = "/skills/listAll.json", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<SkillDTO> listAllSkills() {
        List<SkillDTO> skills = interviewService.listAllSkills();
        
        return skills;
    }
    
}
