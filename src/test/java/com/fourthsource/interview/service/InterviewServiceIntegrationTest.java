package com.fourthsource.interview.service;

import com.fourthsource.interview.dto.SkillDTO;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration({"classpath:application-context.xml", "classpath:persistence-context.xml"})
public class InterviewServiceIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {
    
    @Autowired
    private InterviewService interviewService;

    @Test(groups = "integration-test")
    public void testListAllSkills() {
        interviewService.listAllSkills();

        //TODO: Validate all skills are listed
    }

    @Test(groups = "integration-test")
    public void testRemoveSkill() {
        String name = RandomStringUtils.randomAlphabetic(64);
        String description = RandomStringUtils.randomAlphabetic(512);

        SkillDTO dto = new SkillDTO();
        dto.setName(name);
        dto.setDescription(description);

        interviewService.saveSkill(dto);

        //TODO: Validate skill was removed

        interviewService.removeSkill(dto);
    }

    @Test(groups = "integration-test")
    public void testSaveSkill() {
        String name = RandomStringUtils.randomAlphabetic(64);
        String description = RandomStringUtils.randomAlphabetic(512);

        SkillDTO dto = new SkillDTO();
        dto.setName(name);
        dto.setDescription(description);

        interviewService.saveSkill(dto);

        //TODO: Validate skill was saved
    }

}
