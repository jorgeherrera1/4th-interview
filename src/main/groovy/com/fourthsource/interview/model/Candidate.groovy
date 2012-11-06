package com.fourthsource.interview.model

import org.joda.time.DateTime
import org.springframework.stereotype.Repository

import com.google.common.base.Objects

@Repository
class Candidate {
    
    String name
    
    DateTime dateOfBirth
    
    @Override
    public boolean equals(Object obj) {
        if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof Candidate)) {
            return false
        }
        
        Candidate that = obj as Candidate
        
        return Objects.equal(this.name, that.name) &&
               Objects.equal(this.dateOfBirth, that.dateOfBirth)
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.name, this.dateOfBirth)
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add("name", this.name)
                      .add("dateOfBirth", this.dateOfBirth)
                      .toString()
    }
    
}
