package com.fourthsource.interview.model

import org.testng.annotations.Test

class AskedQuestionIdUnitTest {

	@Test(groups = 'unit-test')
	void "should return interview"() {
		def askedQuestionId = new AskedQuestionId()
		askedQuestionId.interview = new Interview(id: 123456)
		
		assert askedQuestionId.interview == new Interview(id: 123456)
	}
	
	@Test(groups = 'unit-test')
	void "should return question"() {
		def askedQuestionId = new AskedQuestionId()
		askedQuestionId.question = new Question(id: 123456)
		
		assert askedQuestionId.question == new Question(id: 123456)
	}
	
	@Test(groups = 'unit-test')
	void "equals should return true if object is self"() {
		def askedQuestionId = new AskedQuestionId()
		def otherAskedQuestionId = askedQuestionId
		
		assert askedQuestionId == otherAskedQuestionId
	}
	
	
	
}
