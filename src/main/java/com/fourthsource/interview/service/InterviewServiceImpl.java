package com.fourthsource.interview.service;

import com.fourthsource.interview.common.Skills;
import com.fourthsource.interview.data.SkillRepository;
import com.fourthsource.interview.dto.SkillDTO;
import com.fourthsource.interview.model.Skill;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {

    private SkillRepository skillRepository;
    
    @Override
    @Transactional(readOnly = true)
    public List<SkillDTO> listAllSkills() {
        List<Skill> skills = skillRepository.findAll();
        List<SkillDTO> dtos = Lists.newArrayList(Skills.toCollectionOfDTOs(skills));
        
        return dtos;
    }

    @Override
    @Transactional
    public void removeSkill(SkillDTO dto) {
        Preconditions.checkNotNull(dto);

        Skill skill = Skills.fromDTO(dto);
        skillRepository.delete(skill);
    }

    @Override
    @Transactional
    public SkillDTO saveSkill(SkillDTO dto) {
        Preconditions.checkNotNull(dto);

        Skill skill = Skills.fromDTO(dto);
        skill = skillRepository.save(skill);

        return Skills.toDTO(skill);
    }

    @Autowired
    public void setSkillRepository(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

}
