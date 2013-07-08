package com.fourthsource.interview.model

import org.testng.annotations.Test

class GradeUnitTest {

    @Test(groups = 'unit-test')
    void "should return UNSATISFACTORY"() {
        def grade = Grade.UNSATISFACTORY
        
        assert grade.toString() == 'UNSATISFACTORY';
    }
    
    @Test(groups = 'unit-test')
    void "should return BASIC"() {
        def grade = Grade.BASIC
        
        assert grade.toString() == 'BASIC';
    }
    
    @Test(groups = 'unit-test')
    void "should return INTERMEDIATE"() {
        def grade = Grade.INTERMEDIATE
        
        assert grade.toString() == 'INTERMEDIATE';
    }
    
    @Test(groups = 'unit-test')
    void "should return ADVANCED"() {
        def grade = Grade.ADVANCED
        
        assert grade.toString() == 'ADVANCED';
    }
    
    @Test(groups = 'unit-test')
    void "should return OUTSTANDING"() {
        def grade = Grade.OUTSTANDING
        
        assert grade.toString() == 'OUTSTANDING';
    }

}
