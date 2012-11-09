package com.fourthsource.interview.model

import org.joda.time.DateTime
import org.testng.annotations.Test

class InterviewUnitTest {
    
    @Test(groups = 'unit-test')
    void "should return interview id"() {
        def interview = new Interview()
        interview.id = 1234
        
        assert interview.id == 1234
    }
    
    @Test(groups = 'unit-test')
    void "should return candidate"() {
        def interview = new Interview()
        interview.candidate = new Candidate(id: 1, name: 'John Doe', age: 20)
        
        assert interview.candidate == new Candidate(id: 1, name: 'John Doe', age: 20)
    }
    
    @Test(groups = 'unit-test')
    void "should return interview date"() {
        def interview = new Interview()
        interview.date = new DateTime(2012, 12, 12, 0, 0)
        
        assert interview.date == new DateTime(2012, 12, 12, 0, 0)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if object is self"() {
        def interview = new Interview()
        def otherInterview = interview
        
        assert interview.equals(otherInterview)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object has different type"() {
        def interview = new Interview()
        def otherObject = 'a string'
        
        assert !interview.equals(otherObject)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object is null"() {
        def interview = new Interview()
        
        assert !interview.equals(null)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if interviews are equal"() {
        DateTime interviewDate = DateTime.now()
        
        def interview = new Interview(id: 1, candidate: new Candidate(name: 'John Doe'), date: interviewDate)
        def otherInterview = new Interview(id: 1, candidate: new Candidate(name: 'John Doe'), date: interviewDate)
        
        assert interview.equals(otherInterview)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if interviews are different"() {
        DateTime interviewDate = DateTime.now()
        
        def interview = new Interview(id: 1, candidate: new Candidate(name: 'John Doe'), date: interviewDate)
        def otherInterview = new Interview(id: 1, candidate: new Candidate(name: 'Jane Doe'), date: interviewDate)
        
        assert !interview.equals(otherInterview)
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be different for different candidates"() {
        def interview = new Interview(id: 1, candidate: new Candidate(name: 'John Doe'), date: DateTime.now())
        def otherInterview = new Interview(id: 2, candidate: new Candidate(name: 'Jane Doe'), date: DateTime.now())
        
        assert interview.hashCode() != otherInterview.hashCode()
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be equal if candidates are equal"() {
        DateTime interviewDate = DateTime.now()
        
        def interview = new Interview(id: 1, candidate: new Candidate(name: 'John Doe'), date: interviewDate)
        def otherInterview = new Interview(id: 1, candidate: new Candidate(name: 'John Doe'), date: interviewDate)
        
        assert interview.hashCode() == otherInterview.hashCode()
    }
    
}
