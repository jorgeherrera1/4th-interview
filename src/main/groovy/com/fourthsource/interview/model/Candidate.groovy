package com.fourthsource.interview.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.Table
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

import com.google.common.base.Objects

@Entity
@Table(name = 'candidates')
class Candidate implements Serializable {
    
    private static final long serialVersionUID = 1L
    
    @Id
    @Column(name = 'candidate_id')
    @GeneratedValue
    Integer id
    
    @Column(name = 'name')
    @NotNull
    @Size(min = 1, max = 30)
    String name
    
    @Column(name = 'age')
    @Min(18l)
    @Max(70l)
    Integer age
    
    @OneToMany
    @JoinColumn(name = 'candidate_id')
    Set<Interview> interviews
    
    @Override
    public boolean equals(Object obj) {
        if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof Candidate)) {
            return false
        }
        
        Candidate that = obj as Candidate
        
        return Objects.equal(this.id, that.id) &&
               Objects.equal(this.name, that.name) &&
               Objects.equal(this.age, that.age)
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.id, this.name, this.age)
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add('id', this.id)
                      .add('name', this.name)
                      .add('age', this.age)
                      .add('interviews', this.interviews)
                      .toString()
    }
    
}
