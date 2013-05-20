package com.fourthsource.interview.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.Size;

import com.google.common.base.Objects

@Entity
@Table(name = 'TAGS')
class Tag implements Serializable {
    
    @Id
    @Column(name = 'NAME')
    @Size(max = 64)
    String name
    
    @Column(name = 'DESCRIPTION')
    @Size(max = 512)
    String description
    
    @Override
    public boolean equals(Object obj) {
        if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof Tag)) {
            return false
        }
        
        Tag that = obj as Tag
        
        return Objects.equal(this.name, that.name) &&
               Objects.equal(this.description, that.description)
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.name, this.description)
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add('name', this.name)
                      .add('description', this.description)
                      .toString()
    }
    
}
