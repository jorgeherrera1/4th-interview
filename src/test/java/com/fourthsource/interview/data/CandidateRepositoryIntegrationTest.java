package com.fourthsource.interview.data;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:data-repository-context.xml")
public class CandidateRepositoryIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {

    @Test(groups = "integration-test")
    public void test() {
        
    }
    
}
