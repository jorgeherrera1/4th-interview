package com.fourthsource.interview.service;

import java.util.List;

import com.fourthsource.interview.dto.SkillDTO;

public interface InterviewService {
    
    List<SkillDTO> listAllSkills();

    void removeSkill(SkillDTO skillDTO);

    SkillDTO saveSkill(SkillDTO dto);

}
