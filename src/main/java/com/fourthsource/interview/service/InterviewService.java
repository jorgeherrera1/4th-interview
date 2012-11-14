package com.fourthsource.interview.service;

import com.fourthsource.interview.model.Candidate;
import com.fourthsource.interview.model.Difficulty;
import com.fourthsource.interview.model.Interview;
import com.fourthsource.interview.model.Tag;

public interface InterviewService {
    
    Interview quickInterview(Candidate candidate, Difficulty difficulty, Tag... tags);
    
}
