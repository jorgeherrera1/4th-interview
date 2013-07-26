package com.fourthsource.interview.service

import com.fourthsource.interview.data.SkillRepository
import com.fourthsource.interview.dto.SkillDTO
import com.fourthsource.interview.model.Skill
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

import static org.mockito.Matchers.isA
import static org.mockito.Mockito.doNothing
import static org.mockito.Mockito.verify
import static org.mockito.Mockito.when

class InterviewServiceImplUnitTest {

    @Mock
    SkillRepository skillRepository

    InterviewServiceImpl interviewService

    @BeforeTest(groups = 'unit-test')
    void setup() {
        MockitoAnnotations.initMocks(this)

        interviewService = new InterviewServiceImpl()
        interviewService.skillRepository = skillRepository
    }

    @Test(groups = 'unit-test')
    void "should return all skills"() {
        when(skillRepository.findAll()).thenReturn(
            [ new Skill(name: 'PHP', description: 'PHP Language'),
              new Skill(name: 'Java', description: 'Java Language') ]
        )
        
        def skills = interviewService.listAllSkills()

        verify(skillRepository).findAll()
        assert skills.size() == 2
    }

    @Test(groups = 'unit-test', expectedExceptions = NullPointerException)
    void "should break if trying to remove a null skill"() {
        interviewService.removeSkill(null)
    }

    @Test(groups = 'unit-test')
    void "should remove a skill"() {
        doNothing().when(skillRepository).delete(isA(Skill))

        def skillDTO = new SkillDTO(name: 'JavaScript', description: 'JavaScript Language')
        interviewService.removeSkill(skillDTO)

        verify(skillRepository).delete(isA(Skill))
    }
    
}
