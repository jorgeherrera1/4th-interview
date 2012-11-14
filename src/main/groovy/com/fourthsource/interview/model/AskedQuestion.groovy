package com.fourthsource.interview.model

import javax.persistence.Column
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


@Entity
@Table(name = 'interview_asked_questions')
class AskedQuestion implements Serializable {
    
    @EmbeddedId
    AskedQuestionId id
    
    @Column(name = 'grade', length = 14)
    @Enumerated(EnumType.STRING)
    @NotNull
    Grade grade
    
    @Column(name = 'comments')
    @Size(max = 512)
    String comments
    
}
