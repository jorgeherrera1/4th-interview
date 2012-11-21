package com.fourthsource.interview.data;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

import com.fourthsource.interview.model.Question;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.io.Files;

@ContextConfiguration("classpath:*-context.xml")
public class QuestionRepositoryIntegrationTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private QuestionRepository questionRepository;
    
    //@DataProvider(name = "questions")
    //public Object[][] questions() throws Exception {
    //@Test
    public void questions() throws Exception {
        Resource resource = new ClassPathResource("data/questions.csv");
        File file = resource.getFile();
        List<String> lines = Files.readLines(file, Charsets.UTF_8);
        
        Splitter splitter = Splitter.on(',').trimResults().trimResults(CharMatcher.is('"'));
        for (String line: lines) {
            Iterable<String> iterables = splitter.split(line);
            List<String> fields = Lists.newArrayList(iterables);
            
            Question question = new Question();
            question.setQuestion(fields.get(0));
            question.setExpectedAnswer(fields.get(1));
            //question.setDifficulty(Difficulty.valueOf(fields.get(2)));
            
            logger.info(question);
        }
        
        //return null;
    }
    
    
    
}
