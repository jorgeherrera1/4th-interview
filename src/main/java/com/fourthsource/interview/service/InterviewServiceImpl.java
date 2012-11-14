package com.fourthsource.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourthsource.interview.data.CandidateRepository;
import com.fourthsource.interview.data.InterviewRepository;
import com.fourthsource.interview.model.Candidate;
import com.fourthsource.interview.model.Difficulty;
import com.fourthsource.interview.model.Interview;
import com.fourthsource.interview.model.Tag;
import static com.google.common.base.Preconditions.checkNotNull;

@Service
public class InterviewServiceImpl implements InterviewService {
    
    @Autowired
    private InterviewRepository interviewRepository;
    
    @Autowired
    private CandidateRepository candidateRepository;
    
    @Override
    public Interview quickInterview(Candidate candidate, Difficulty difficulty, Tag... tags) {
        checkNotNull(candidate);
        checkNotNull(difficulty);
        checkNotNull(tags);
        
        candidate = candidateRepository.save(candidate);
        
        
        
        return null;
    }

}
