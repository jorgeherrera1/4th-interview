package com.fourthsource.interview.model

import org.testng.annotations.Test

import com.google.common.collect.Sets;

class QuestionUnitTest {

    @Test(groups = 'unit-test')
    void "should return question id"() {
        def question = new Question()
        question.id = 12345
        
        assert question.id == 12345
    }
    
    @Test(groups = 'unit-test')
    void "should return question"() {
        def question = new Question()
        question.question = 'What is the final keyword for?'
        
        assert question.question == 'What is the final keyword for?'
    }
    
    @Test(groups = 'unit-test')
    void "should return expected answer"() {
        def question = new Question()
        question.expectedAnswer = 'Objects cannot change reference; primitives cannot change value'
        
        assert question.expectedAnswer == 'Objects cannot change reference; primitives cannot change value'
    }
    
    @Test(groups = 'unit-test')
    void "should return question level"() {
        def question = new Question()
        question.level = Level.INTERMEDIATE
        
        assert question.level == Level.INTERMEDIATE
    }
    
    @Test(groups = 'unit-test')
    void "should return question tags"() {
        def question = new Question()
        question.tags = Sets.newHashSet(new Tag(name: 'Java'))
        
        assert question.tags == Sets.newHashSet(new Tag(name: 'Java'))
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if object is self"() {
        def question = new Question()
        def otherQuestion = question
        
        assert question.equals(otherQuestion)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object has different type"() {
        def question = new Question()
        def otherObject = 'a string'
        
        assert !question.equals(otherObject)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object is null"() {
        def question = new Question()
        
        assert !question.equals(null)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if questions are equal"() {
        def question = new Question(
            id: 123,
            question: 'What is the final keyword for?',
            expectedAnswer: 'Objects cannot change reference; primitives cannot change value',
            level: Level.INTERMEDIATE,
            tags: Sets.newHashSet(new Tag(name: 'Java'))
        );
        def otherQuestion = new Question(
            id: 123,
            question: 'What is the final keyword for?',
            expectedAnswer: 'Objects cannot change reference; primitives cannot change value',
            level: Level.INTERMEDIATE,
            tags: Sets.newHashSet(new Tag(name: 'Java'))
        ); 
        
        assert question.equals(otherQuestion)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if questions are different"() {
        def question = new Question(
            id: 123,
            question: 'What is the final keyword for?',
            expectedAnswer: 'Objects cannot change reference; primitives cannot change value',
            level: Level.INTERMEDIATE,
            tags: Sets.newHashSet(new Tag(name: 'Java'))
        );
        def otherQuestion = new Question(
            id: 456,
            question: 'What is the native keyword for?',
            expectedAnswer: 'Allows Java to run native code (e.g., C, C++)',
            level: Level.SENIOR,
            tags: Sets.newHashSet(new Tag(name: 'Java'))
        );
        
        assert !question.equals(otherQuestion)
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be equal if tags are equal"() {
        def question = new Question(
            id: 123,
            question: 'What is the final keyword for?',
            expectedAnswer: 'Objects cannot change reference; primitives cannot change value',
            level: Level.INTERMEDIATE,
            tags: Sets.newHashSet(new Tag(name: 'Java'))
        );
        def otherQuestion = new Question(
            id: 123,
            question: 'What is the final keyword for?',
            expectedAnswer: 'Objects cannot change reference; primitives cannot change value',
            level: Level.INTERMEDIATE,
            tags: Sets.newHashSet(new Tag(name: 'Java'))
        );
        
        assert question.hashCode() == otherQuestion.hashCode()
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be different for different questions"() {
        def question = new Question(
            id: 123,
            question: 'What is the final keyword for?',
            expectedAnswer: 'Objects cannot change reference; primitives cannot change value',
            level: Level.INTERMEDIATE,
            tags: Sets.newHashSet(new Tag(name: 'Java'))
        );
        def otherQuestion = new Question(
            id: 456,
            question: 'What is the native keyword for?',
            expectedAnswer: 'Allows Java to run native code (e.g., C, C++)',
            level: Level.SENIOR,
            tags: Sets.newHashSet(new Tag(name: 'Java'))
        );
        
        assert question.hashCode() != otherQuestion.hashCode()
    }

}
