package com.fourthsource.interview.dto

import org.testng.annotations.Test

class SkillDTODTOUnitTest {
    
    @Test(groups = 'unit-test')
    void "should return skill name"() {
        def skill = new SkillDTO()
        skill.name = 'Java'
        
        assert skill.name == 'Java'
    }
    
    @Test(groups = 'unit-test')
    void "should return skill description"() {
        def skill = new SkillDTO()
        skill.description = 'Java Programming Language questions'
        
        assert skill.description == 'Java Programming Language questions'
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if object is self"() {
        def skill = new SkillDTO()
        def otherSkillDTO = skill
        
        assert skill.equals(otherSkillDTO)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object has different type"() {
        def skill = new SkillDTO()
        def otherObject = 'a string'
        
        assert !skill.equals(otherObject)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object is null"() {
        def skill = new SkillDTO()
        
        assert !skill.equals(null)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if skills are equal"() {
        def skill = new SkillDTO(name: 'PHP', description: 'PHP language questions')
        def otherSkillDTO = new SkillDTO(name: 'PHP', description: 'PHP language questions')
        
        assert skill.equals(otherSkillDTO)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if skills are different"() {
        def skill = new SkillDTO(name: 'PHP', description: 'PHP language questions')
        def otherSkillDTO = new SkillDTO(name: 'Java', description: 'Java language questions')
        
        assert !skill.equals(otherSkillDTO)
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be different for different skills"() {
        def skill = new SkillDTO(name: 'PHP', description: 'PHP language questions')
        def otherSkillDTO = new SkillDTO(name: 'Java', description: 'Java language questions')
        
        assert skill.hashCode() != otherSkillDTO.hashCode()
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be equal if skills are equal"() {
        def skill = new SkillDTO(name: 'PHP', description: 'PHP language questions')
        def otherSkillDTO = new SkillDTO(name: 'PHP', description: 'PHP language questions')
        
        assert skill.hashCode() == otherSkillDTO.hashCode()
    }
    
}
