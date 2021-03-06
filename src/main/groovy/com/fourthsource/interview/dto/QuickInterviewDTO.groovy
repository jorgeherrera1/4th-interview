package com.fourthsource.interview.dto

import com.google.common.base.Objects

class QuickInterviewDTO {

    String candidateName
    
    String interviewLevel
    
    Set skills
    
    @Override
    public boolean equals(Object obj) {
        if (obj?.is(this)) {
            return true
        }
        
        if (!(obj instanceof QuickInterviewDTO)) {
            return false
        }
        
        QuickInterviewDTO that = obj as QuickInterviewDTO
        
        return Objects.equal(this.candidateName, that.candidateName) &&
               Objects.equal(this.interviewLevel, that.interviewLevel) &&
               Objects.equal(this.skills, that.skills)
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.candidateName, this.interviewLevel, this.skills)
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add('candidateName', this.candidateName)
                      .add('interviewLevel', this.interviewLevel)
                      .add('skills', this.skills)
                      .toString()
    }

}
