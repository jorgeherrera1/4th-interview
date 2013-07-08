package com.fourthsource.interview.data;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

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
        
        assertNotNull(skills);
        assertEquals(skills.size(), 4);
    }
    
    @Test(groups = "integration-test")
    public void testFindOne() {
        Skill skill = skillRepository.findOne("Java");
        
        assertNotNull(skill);
        assertEquals(skill.getName(), "Java");
        assertEquals(skill.getDescription(), "Java programming language");
    }

}
