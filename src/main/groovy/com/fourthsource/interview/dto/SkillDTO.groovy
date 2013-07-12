package com.fourthsource.interview.dto

import com.google.common.base.Objects

class SkillDTO {
    
    String name
    
    String description
    
    @Override
    public boolean equals(Object obj) {
        if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof SkillDTO)) {
            return false
        }
        
        SkillDTO that = obj as SkillDTO
        
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
