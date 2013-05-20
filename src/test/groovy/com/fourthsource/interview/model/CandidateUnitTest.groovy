package com.fourthsource.interview.model

import org.joda.time.DateTime
import org.testng.annotations.Test

import com.google.common.collect.Sets;

class CandidateUnitTest {
    
    @Test(groups = 'unit-test')
    void "should return candidate id"() {
        def candidate = new Candidate()
        candidate.id = 1234
        
        assert candidate.id == 1234
    }
    
	@Test(groups = 'unit-test')
	void "should return candidate name"() {
		def candidate = new Candidate()
		candidate.name = 'John Doe'
		
		assert candidate.name == 'John Doe'
	}
	
	@Test(groups = 'unit-test')
    void "should return interviews"() {
        def interviewDate = DateTime.now()
        
        def candidate = new Candidate()
        candidate.interviews = Sets.newHashSet(new Interview(id: 1234, candidate: candidate, date: interviewDate))
        
        assert candidate.interviews == Sets.newHashSet(new Interview(id: 1234, candidate: candidate, date: interviewDate))
    }
    
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
       def candidate = new Candidate(name: 'John Doe')
       def otherCandidate = new Candidate(name: 'John Doe')
       
       assert candidate.equals(otherCandidate)
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be different for different candidates"() {
        def candidate = new Candidate(name: 'John Doe')
        def otherCandidate = new Candidate(name: 'Jane Doe')
        
        assert candidate.hashCode() != otherCandidate.hashCode()
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be equal if candidates are equal"() {
       def candidate = new Candidate(name: 'John Doe')
       def otherCandidate = new Candidate(name: 'John Doe')
       
       assert candidate.hashCode() == otherCandidate.hashCode()
    }
    
}
