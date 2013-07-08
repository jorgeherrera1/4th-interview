package com.fourthsource.interview.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

import org.hibernate.annotations.Type
import org.joda.time.DateTime

import com.google.common.base.Objects

@Entity
@Table(name = 'INTERVIEWS')
class Interview implements Serializable {
    
    private static final long serialVersionUID = 1L
    
    @Id
    @Column(name = 'INTERVIEW_ID')
    @GeneratedValue
    Integer id
    
    @ManyToOne
    @JoinColumn(name = 'CANDIDATE_ID')
    Candidate candidate
    
    @Column(name = 'INTERVIEW_DATE')
    @Type(type='org.joda.time.contrib.hibernate.PersistentDateTime')
    DateTime date
    
    @OneToMany(mappedBy = 'id.interview')
    List<AskedQuestion> askedQuestions
    
    @Override
    public boolean equals(Object obj) {
        if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof Interview)) {
            return false
        }
        
        Interview that = obj as Interview
        
        return Objects.equal(this.id, that.id) &&
               Objects.equal(this.candidate, that.candidate) &&
               Objects.equal(this.date, that.date)
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.id, this.candidate, this.date)
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add('id', this.id)
                      .add('candidate', this.candidate?.name)
                      .add('date', this.date)
                      .toString()
    }
    
}
