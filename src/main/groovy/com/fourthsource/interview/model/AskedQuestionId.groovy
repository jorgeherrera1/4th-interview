package com.fourthsource.interview.model

import javax.persistence.Embeddable
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Embeddable
class AskedQuestionId implements Serializable {

    @OneToOne
    @JoinColumn(name = 'interview_id')
    Interview interview
    
    @OneToOne
    @JoinColumn(name = 'question_id')
    Question question
    
}
