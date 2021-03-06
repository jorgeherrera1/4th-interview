package com.fourthsource.interview.data;

import static org.testng.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.fourthsource.interview.model.Candidate;

@ContextConfiguration({"classpath:application-context.xml", "classpath:persistence-context.xml"})
public class CandidateRepositoryIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private CandidateRepository candidateRepository;
    
    @Test(groups = "integration-test")
    public void testSave() {
        Candidate candidate = new Candidate();
        candidate.setName("John Doe");
        
        candidate = candidateRepository.save(candidate);
        
        logger.info("Candidate: " + candidate);
        
        assertNotNull(candidate.getId());
    }
    
}
