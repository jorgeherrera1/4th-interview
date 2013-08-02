package com.fourthsource.interview.dto

import com.google.common.base.Objects

class SkillDTO {

    Integer id

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
