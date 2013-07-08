package com.fourthsource.interview.dto

import org.testng.annotations.Test

import com.google.common.collect.Sets

class QuickInterviewDTOUnitTest {

    @Test(groups = 'unit-test')
    void "should return candidate name"() {
        def quickInterview = new QuickInterviewDTO()
        
        quickInterview.candidateName = 'Jorge Herrera'
        
        assert quickInterview.candidateName == 'Jorge Herrera'
    }
    
    @Test(groups = 'unit-test')
    void "should return interview level"() {
        def quickInterview = new QuickInterviewDTO()
        
        quickInterview.interviewLevel = 'Junior'
        
        assert quickInterview.interviewLevel == 'Junior'
    }
    
    @Test(groups = 'unit-test')
    void "should return interview skills"() {
        def quickInterview = new QuickInterviewDTO()
        
        quickInterview.skills = Sets.newHashSet('Java', 'Object Orientation');
        
        assert quickInterview.skills == Sets.newHashSet('Java', 'Object Orientation');
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if object is self"() {
        def quickInterview = new QuickInterviewDTO()
        def otherQuickInterview = quickInterview
        
        assert quickInterview.equals(quickInterview)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object has different type"() {
        def quickInterview = new QuickInterviewDTO()
        def otherObject = 'a string'
        
        assert !quickInterview.equals(otherObject)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if object is null"() {
        def quickInterview = new QuickInterviewDTO()
        
        assert !quickInterview.equals(null)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return true if the quick interviews are equal"() {
        def quickInterview = new QuickInterviewDTO(
            candidateName: 'Jorge Herrera',
            interviewLevel: 'Junior',
            skills: Sets.newHashSet('Java', 'Object Orientation')
        )
        
        def anotherQuickInterview = new QuickInterviewDTO(
            candidateName: 'Jorge Herrera',
            interviewLevel: 'Junior',
            skills: Sets.newHashSet('Java', 'Object Orientation')
        )
        
        assert quickInterview.equals(anotherQuickInterview)
    }
    
    @Test(groups = 'unit-test')
    void "equals should return false if the quick interviews are different"() {
        def quickInterview = new QuickInterviewDTO(
            candidateName: 'Bart Simpson',
            interviewLevel: 'Senior',
            skills: Sets.newHashSet('PHP', 'Object Orientation')
        )
        
        def anotherQuickInterview = new QuickInterviewDTO(
            candidateName: 'Jorge Herrera',
            interviewLevel: 'Junior',
            skills: Sets.newHashSet('Java', 'Object Orientation')
        )
        
        assert !quickInterview.equals(anotherQuickInterview)
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be equal if the quick interviews are equal"() {
        def quickInterview = new QuickInterviewDTO(
            candidateName: 'Jorge Herrera',
            interviewLevel: 'Junior',
            skills: Sets.newHashSet('Java', 'Object Orientation')
        )
        
        def anotherQuickInterview = new QuickInterviewDTO(
            candidateName: 'Jorge Herrera',
            interviewLevel: 'Junior',
            skills: Sets.newHashSet('Java', 'Object Orientation')
        )
        
        assert quickInterview.hashCode() == anotherQuickInterview.hashCode()
    }
    
    @Test(groups = 'unit-test')
    void "hash code should be different if the quick interviews are different"() {
        def quickInterview = new QuickInterviewDTO(
            candidateName: 'Bart Simpson',
            interviewLevel: 'Senior',
            skills: Sets.newHashSet('PHP', 'Object Orientation')
        )
        
        def anotherQuickInterview = new QuickInterviewDTO(
            candidateName: 'Jorge Herrera',
            interviewLevel: 'Junior',
            skills: Sets.newHashSet('Java', 'Object Orientation')
        )
        
        assert quickInterview.hashCode() != anotherQuickInterview.hashCode()
    }

}
