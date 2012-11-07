package com.fourthsource.interview.data;

import static org.testng.Assert.assertNotNull;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.fourthsource.interview.model.Candidate;

@ContextConfiguration("classpath:persistence-context.xml")
public class CandidateRepositoryIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private CandidateRepository candidateRepository;
    
    @Test(groups = "integration-test")
    public void testSave() {
        Candidate candidate = new Candidate();
        candidate.setName("John Doe");
        candidate.setDateOfBirth(new DateTime(1990, 10, 20, 0, 0));
        
        candidate = candidateRepository.save(candidate);
        
        logger.info("Candidate: " + candidate);
        
        assertNotNull(candidate.getId());
    }
    
}
