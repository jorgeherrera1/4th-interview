package com.fourthsource.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

@ContextConfiguration({"classpath:application-context.xml", "classpath:persistence-context.xml"})
public class InterviewServiceIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {
    
    @Autowired
    private InterviewService interviewService;
    
}
