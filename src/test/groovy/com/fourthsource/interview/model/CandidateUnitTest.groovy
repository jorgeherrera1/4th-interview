package com.fourthsource.interview.model

import org.joda.time.DateTime
import org.testng.annotations.Test

class CandidateUnitTest {
    
    @Test(groups = 'unit-test')
    void "equals should return true if object is self"() {
        def candidate = new Candidate()
        def otherCandidate = candidate
        
        assert candidate.equals(otherCandidate)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object has different type"() {
        def candidate = new Candidate()
        def otherObject = 'a string'
        
        assert !candidate.equals(otherObject)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object is null"() {
        def candidate = new Candidate()
        
        assert !candidate.equals(null)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if candidates are equal"() {
       def candidate = new Candidate(name: 'John Doe', dateOfBirth: new DateTime(1990, 12, 23, 0, 0))
       def otherCandidate = new Candidate(name: 'John Doe', dateOfBirth: new DateTime(1990, 12, 23, 0, 0))
       
       assert candidate.equals(otherCandidate)
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be different for different candidates"() {
        def candidate = new Candidate(name: 'John Doe', dateOfBirth: new DateTime(1990, 12, 23, 0, 0))
        def otherCandidate = new Candidate(name: 'Jane Doe', dateOfBirth: new DateTime(1992, 11, 3, 0, 0))
        
        assert candidate.hashCode() != otherCandidate.hashCode()
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be equal if candidates are equal"() {
       def candidate = new Candidate(name: 'John Doe', dateOfBirth: new DateTime(1990, 12, 23, 0, 0))
       def otherCandidate = new Candidate(name: 'John Doe', dateOfBirth: new DateTime(1990, 12, 23, 0, 0))
       
       assert candidate.hashCode() == otherCandidate.hashCode()
    }
    
}
