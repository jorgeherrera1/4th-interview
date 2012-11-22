package com.fourthsource.interview.data;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.fourthsource.interview.model.Tag;

@ContextConfiguration({"classpath:application-context.xml", "classpath:persistence-context.xml"})
public class TagRepositoryIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {
    
    @Autowired
    private TagRepository tagRepository;
    
    @Test(groups = "integration-test")
    public void testFindAll() {
        List<Tag> tags = tagRepository.findAll();
        
        assertNotNull(tags);
        assertEquals(tags.size(), 4);
    }
    
    @Test(groups = "integration-test")
    public void testFindOne() {
        Tag tag = tagRepository.findOne("Java");
        
        assertNotNull(tag);
        assertEquals(tag.getName(), "Java");
        assertEquals(tag.getDescription(), "Java programming language");
    }

}
