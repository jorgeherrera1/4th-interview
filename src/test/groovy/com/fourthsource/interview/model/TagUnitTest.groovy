package com.fourthsource.interview.model

import org.testng.annotations.Test

class TagUnitTest {
    
    @Test(groups = 'unit-test')
    void "should return tag name"() {
        def tag = new Tag()
        tag.name = 'Java'
        
        assert tag.name == 'Java'
    }
    
    @Test(groups = 'unit-test')
    void "should return tag description"() {
        def tag = new Tag()
        tag.description = 'Java Programming Language questions'
        
        assert tag.description == 'Java Programming Language questions'
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if object is self"() {
        def tag = new Tag()
        def otherTag = tag
        
        assert tag.equals(otherTag)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object has different type"() {
        def tag = new Tag()
        def otherObject = 'a string'
        
        assert !tag.equals(otherObject)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object is null"() {
        def tag = new Tag()
        
        assert !tag.equals(null)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if tags are equal"() {
        def tag = new Tag(name: 'PHP', description: 'PHP language questions')
        def otherTag = new Tag(name: 'PHP', description: 'PHP language questions')
        
        assert tag.equals(otherTag)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if tags are different"() {
        def tag = new Tag(name: 'PHP', description: 'PHP language questions')
        def otherTag = new Tag(name: 'Java', description: 'Java language questions')
        
        assert !tag.equals(otherTag)
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be different for different tags"() {
        def tag = new Tag(name: 'PHP', description: 'PHP language questions')
        def otherTag = new Tag(name: 'Java', description: 'Java language questions')
        
        assert tag.hashCode() != otherTag.hashCode()
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be equal if tags are equal"() {
        def tag = new Tag(name: 'PHP', description: 'PHP language questions')
        def otherTag = new Tag(name: 'PHP', description: 'PHP language questions')
        
        assert tag.hashCode() == otherTag.hashCode()
    }
    
}
