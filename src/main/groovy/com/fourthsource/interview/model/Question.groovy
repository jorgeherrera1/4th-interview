package com.fourthsource.interview.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

import com.google.common.base.Objects

@Entity
@Table(name = 'QUESTIONS')
class Question implements Serializable {
    
    private static final long serialVersionUID = 1L
    
    @Id
    @Column(name = 'QUESTION_ID')
    @GeneratedValue
    Integer id
    
    @Column(name = 'QUESTION')
    @Size(max = 128)
    @NotNull
    String question
    
    @Column(name = 'EXPECTED_ANSWER')
    @Size(max = 512)
    String expectedAnswer
    
    @Column(name = 'QUESTION_LEVEL', length = 12)
    @Enumerated(EnumType.STRING)
    @NotNull
    Level level
    
    @ManyToMany
    @JoinTable(name = 'QUESTION_SKILLS',
               joinColumns = @JoinColumn(name = 'QUESTION_ID'),
               inverseJoinColumns = @JoinColumn(name = 'SKILL_NAME'))
    Set<Skill> skills
    
    @Override
    public boolean equals(Object obj) {
        if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof Question)) {
            return false
        }
        
        Question that = obj as Question
        
        return Objects.equal(this.id, that.id) &&
               Objects.equal(this.question, that.question) &&
               Objects.equal(this.expectedAnswer, that.expectedAnswer) &&
               Objects.equal(this.level, that.level)
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.id, this.question, this.expectedAnswer, this.level)
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add('id', this.id)
                      .add('question', this.question)
                      .add('expectedAnswer', this.expectedAnswer)
                      .add('level', this.level)
                      .toString()
    }
    
}
