package com.fourthsource.interview.model

import javax.persistence.Embeddable
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import com.google.common.base.Objects

@Embeddable
class AskedQuestionId implements Serializable {

    @OneToOne
    @JoinColumn(name = 'INTERVIEW_ID')
    Interview interview
    
    @OneToOne
    @JoinColumn(name = 'QUESTION_ID')
    Question question
    
	@Override
	public boolean equals(Object obj) {
		if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof AskedQuestionId)) {
            return false
        }
		
		AskedQuestionId that = obj as AskedQuestionId
		
		return Objects.equal(this.interview.id, that.interview.id) &&
			   Objects.equal(this.question.id, that.question.id)
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(this.interview.id, this.question.id);
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				      .add('interview', this.interview.id)
					  .add('question', this.question.id)
					  .toString()
	}
	
}
