package com.fourthsource.interview.common

import org.testng.annotations.Test

import com.fourthsource.interview.dto.SkillDTO
import com.fourthsource.interview.model.Skill
import com.google.common.collect.Lists;

class SkillsUnitTest {
    
    @Test(groups = 'unit-test', expectedExceptions = NullPointerException)
    void "toDTO should fail if null is passed as parameter"() {
        Skills.toDTO(null)
    }

    @Test(groups = 'unit-test', expectedExceptions = NullPointerException)
    void "fromDTO should fail if null is passed as parameter"() {
        Skills.fromDTO(null)
    }
    
    @Test(groups = 'unit-test')
    void "toDTO should return SkillDTO"() {
        def skill = new Skill()
        skill.name = 'Java'
        skill.description = 'Java Programming Language'
        
        def dto = Skills.toDTO(skill)
        
        assert dto instanceof SkillDTO
        assert dto.name == 'Java'
        assert dto.description == 'Java Programming Language'
    }

    @Test(groups = 'unit-test')
    void "fromDTO should return Skill"() {
        def dto = new SkillDTO()
        dto.name = 'Design Patterns'
        dto.description = 'Design patterns about object oriented languages'

        def skill = Skills.fromDTO(dto)

        assert skill instanceof Skill
        assert skill.name == 'Design Patterns'
        assert skill.description == 'Design patterns about object oriented languages'
    }
    
    @Test(groups = 'unit-test', expectedExceptions = NullPointerException)
    void "toCollectionOfDTOs should fail if null is passed as parameter"() {
        Skills.toCollectionOfDTOs(null)
    }
    
    @Test(groups = 'unit-test')
    void "toCollectionOfDTOs should return collection of SkillDTOs"() {
        def javaSkill = new Skill(name: 'Java', description: 'Java Programming Language')
        def phpSkill = new Skill(name: 'PHP', description: 'PHP Programming Language')
        def skills = [ javaSkill, phpSkill ]
        
        def dtos = Skills.toCollectionOfDTOs(skills);
        
        assert dtos.size() == 2
        dtos.each {
            assert it instanceof SkillDTO
        }
        assert dtos[0].name == 'Java'
        assert dtos[0].description == 'Java Programming Language'
        assert dtos[1].name == 'PHP'
        assert dtos[1].description == 'PHP Programming Language'
    }
    
}
