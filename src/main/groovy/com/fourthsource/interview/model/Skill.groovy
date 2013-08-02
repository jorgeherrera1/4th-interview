package com.fourthsource.interview.model

import com.google.common.base.Objects

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = 'SKILLS')
class Skill implements Serializable {
    
    @Id
    @Column(name = 'SKILL_ID')
    Integer id

    @Column(name = 'NAME', unique = true)
    @Size(max = 64)
    @NotNull
    String name
    
    @Column(name = 'DESCRIPTION')
    @Size(max = 512)
    String description
    
    @Override
    public boolean equals(Object obj) {
        if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof Skill)) {
            return false
        }
        
        Skill that = obj as Skill
        
        return Objects.equal(this.id, that.id) &&
               Objects.equal(this.name, that.name) &&
               Objects.equal(this.description, that.description)
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.id, this.name, this.description)
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add('id', this.id)
                      .add('name', this.name)
                      .add('description', this.description)
                      .toString()
    }
    
}
