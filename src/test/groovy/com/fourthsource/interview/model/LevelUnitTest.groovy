package com.fourthsource.interview.model

import org.testng.annotations.Test

class LevelUnitTest {

    @Test(groups = 'unit-test')
    void "should return Junior level"() {
        def level = Level.JUNIOR
        
        assert level == Level.valueOf('JUNIOR')
    }
    
    @Test(groups = 'unit-test')
    void "should return Intermediate level"() {
        def level = Level.INTERMEDIATE
        
        assert level == Level.valueOf('INTERMEDIATE')
    }
    
    @Test(groups = 'unit-test')
    void "should return Senior level"() {
        def level = Level.SENIOR
        
        assert level == Level.valueOf('SENIOR')
    }

}
