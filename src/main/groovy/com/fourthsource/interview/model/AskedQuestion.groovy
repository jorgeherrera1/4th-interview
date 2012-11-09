package com.fourthsource.interview.model

import javax.persistence.Column
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


class AskedQuestion implements Serializable {
    
    AskedQuestionId id
    
    @Column(name = 'grade', length = 14)
    @Enumerated(EnumType.STRING)
    @NotNull
    Grade grade
    
    @Column(name = 'comments')
    @Size(max = 512)
    String comments
    
}
