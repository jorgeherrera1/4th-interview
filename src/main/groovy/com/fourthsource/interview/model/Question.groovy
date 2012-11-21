package com.fourthsource.interview.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

import com.google.common.base.Objects

@Entity
@Table(name = 'questions')
class Question implements Serializable {
    
    private static final long serialVersionUID = 1L
    
    @Id
    @Column(name = 'question_id')
    @GeneratedValue
    Integer id
    
    @Column(name = 'question')
    @Size(max = 128)
    @NotNull
    String question
    
    @Column(name = 'expected_answer')
    @Size(max = 512)
    String expectedAnswer
    
    @OneToOne
    @JoinColumn(name = 'difficulty')
    Difficulty difficulty
    
    @ManyToMany
    @JoinTable(name = 'question_tags',
               joinColumns = @JoinColumn(name = 'question_id'),
               inverseJoinColumns = @JoinColumn(name = 'tag_name'))
    Set<Tag> tags
    
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
               Objects.equal(this.difficulty, that.difficulty)
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.id, this.question, this.expectedAnswer, this.difficulty)
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add('id', this.id)
                      .add('question', this.question)
                      .add('expectedAnswer', this.expectedAnswer)
                      .add('difficulty', this.difficulty)
                      .toString()
    }
    
}
