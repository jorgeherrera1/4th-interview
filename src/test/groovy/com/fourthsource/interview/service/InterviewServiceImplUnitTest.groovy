package com.fourthsource.interview.service

import static org.mockito.Mockito.*;
import org.testng.annotations.Test

import com.fourthsource.interview.data.SkillRepository
import com.fourthsource.interview.model.Skill

class InterviewServiceImplUnitTest {
    
    @Test(groups = 'unit-test')
    void "should return all skills"() {
        def interviewService = new InterviewServiceImpl()
        interviewService.skillRepository = mock(SkillRepository)
        when(interviewService.skillRepository.findAll()).thenReturn(
            [ new Skill(name: 'PHP', description: 'PHP Language'),
              new Skill(name: 'Java', description: 'Java Language') ]
        )
        
        def skills = interviewService.listAllSkills()
        assert skills.size() == 2
    }
    
}
