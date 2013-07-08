package com.fourthsource.interview.model

import org.testng.annotations.Test

class SkillUnitTest {
    
    @Test(groups = 'unit-test')
    void "should return skill name"() {
        def skill = new Skill()
        skill.name = 'Java'
        
        assert skill.name == 'Java'
    }
    
    @Test(groups = 'unit-test')
    void "should return skill description"() {
        def skill = new Skill()
        skill.description = 'Java Programming Language questions'
        
        assert skill.description == 'Java Programming Language questions'
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if object is self"() {
        def skill = new Skill()
        def otherSkill = skill
        
        assert skill.equals(otherSkill)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object has different type"() {
        def skill = new Skill()
        def otherObject = 'a string'
        
        assert !skill.equals(otherObject)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object is null"() {
        def skill = new Skill()
        
        assert !skill.equals(null)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if skills are equal"() {
        def skill = new Skill(name: 'PHP', description: 'PHP language questions')
        def otherSkill = new Skill(name: 'PHP', description: 'PHP language questions')
        
        assert skill.equals(otherSkill)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if skills are different"() {
        def skill = new Skill(name: 'PHP', description: 'PHP language questions')
        def otherSkill = new Skill(name: 'Java', description: 'Java language questions')
        
        assert !skill.equals(otherSkill)
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be different for different skills"() {
        def skill = new Skill(name: 'PHP', description: 'PHP language questions')
        def otherSkill = new Skill(name: 'Java', description: 'Java language questions')
        
        assert skill.hashCode() != otherSkill.hashCode()
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be equal if skills are equal"() {
        def skill = new Skill(name: 'PHP', description: 'PHP language questions')
        def otherSkill = new Skill(name: 'PHP', description: 'PHP language questions')
        
        assert skill.hashCode() == otherSkill.hashCode()
    }
    
}
