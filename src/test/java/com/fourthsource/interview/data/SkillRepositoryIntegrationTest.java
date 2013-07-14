package com.fourthsource.interview.data;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.fourthsource.interview.model.Skill;

@ContextConfiguration({"classpath:application-context.xml", "classpath:persistence-context.xml"})
public class SkillRepositoryIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {
    
    @Autowired
    private SkillRepository skillRepository;
    
    @Test(groups = "integration-test")
    public void testFindAll() {
        List<Skill> skills = skillRepository.findAll();
        int beforeNewSkill = skills.size();
        
        Skill abcSkill = new Skill();
        abcSkill.setName("ABC");
        abcSkill.setDescription("ABC Skill");
        
        Skill xyzSkill = new Skill();
        xyzSkill.setName("XYZ");
        xyzSkill.setDescription("XYZ Skill");
        
        skillRepository.save(abcSkill);
        skillRepository.save(xyzSkill);
        
        skills = skillRepository.findAll();
        int afterNewSkill = skills.size();
        
        assertEquals(afterNewSkill, beforeNewSkill + 2);
    }

}
