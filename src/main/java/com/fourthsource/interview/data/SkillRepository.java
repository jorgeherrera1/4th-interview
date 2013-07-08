package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourthsource.interview.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, String> {
    
    
    
}
