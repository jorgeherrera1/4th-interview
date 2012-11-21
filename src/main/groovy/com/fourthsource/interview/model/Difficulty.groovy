package com.fourthsource.interview.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

import com.google.common.base.Objects

@Entity
@Table(name = 'difficulties')
class Difficulty implements Serializable {
    
    @Id
    @Column(name = 'val')
    int value
    
    @Column(name = 'name')
    @Size(max = 32)
    @NotNull
    String name
    
    @Column(name = 'description')
    @Size(max = 512)
    String description
    
    @Override
    public boolean equals(Object obj) {
        if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof Difficulty)) {
            return false
        }
        
        Difficulty that = obj as Difficulty
        
        return Objects.equal(this.value, that.value) &&
               Objects.equal(this.name, that.name) &&
               Objects.equal(this.description, that.description)
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.value, this.name, this.description)
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add('value', this.value)
                      .add('name', this.name)
                      .add('description', this.description)
                      .toString()
    }
    
}
