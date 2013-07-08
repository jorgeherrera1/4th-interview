package com.fourthsource.interview.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

@ContextConfiguration("classpath:*-context.xml")
public class QuestionRepositoryIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private QuestionRepository questionRepository;
    
}
