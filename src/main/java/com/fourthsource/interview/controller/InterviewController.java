package com.fourthsource.interview.controller;

import com.fourthsource.interview.dto.SkillDTO;
import com.fourthsource.interview.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class InterviewController {

    @Autowired
    private InterviewService interviewService;
    
    @RequestMapping(value = "/skills/listAll.json",
            method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody List<SkillDTO> listAllSkills() {
        List<SkillDTO> skills = interviewService.listAllSkills();
        
        return skills;
    }

    @RequestMapping(value = "/skills/remove.json",
            method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void removeSkill(@RequestBody SkillDTO skill) {
        interviewService.removeSkill(skill);
    }

    @RequestMapping(value = "/skills/save.json",
            method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void saveSkill(@RequestBody SkillDTO skill) {
        interviewService.saveSkill(skill);
    }
    
}
