package com.fourthsource.interview.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.fourthsource.interview.model.Tag;

@ContextConfiguration({"classpath:application-context.xml", "classpath:persistence-context.xml"})
public class TagServiceIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {
    
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private TagService tagService;
    
    @Test(groups = "integration-test")
    public void testNewTag() {
        Tag tag = tagService.newTag("Java", "Java Programming Language");
        logger.info("Saved tag: {}", tag);
        
        assertNotNull(tag);
        assertEquals(tag.getName(), "Java");
        assertEquals(tag.getDescription(), "Java Programming Language");
    }
    
}
