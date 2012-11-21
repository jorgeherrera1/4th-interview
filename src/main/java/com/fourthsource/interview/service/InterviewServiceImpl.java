package com.fourthsource.interview.service;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourthsource.interview.data.CandidateRepository;
import com.fourthsource.interview.data.DifficultyRepository;
import com.fourthsource.interview.data.InterviewRepository;
import com.fourthsource.interview.model.Candidate;
import com.fourthsource.interview.model.Difficulty;
import com.fourthsource.interview.model.Interview;
import com.fourthsource.interview.model.Tag;

@Service
public class InterviewServiceImpl implements InterviewService {
    
    @Autowired
    private InterviewRepository interviewRepository;
    
    @Autowired
    private CandidateRepository candidateRepository;
    
    @Autowired
    private DifficultyRepository difficultyRepository;
    
    @Override
    public Interview quickInterview(Candidate candidate, Difficulty difficulty, Tag... tags) {
        checkNotNull(candidate);
        checkNotNull(difficulty);
        checkNotNull(tags);
        
        candidate = candidateRepository.save(candidate);
        
        
        
        return null;
    }
    
    @Override
    public List<Difficulty> getDifficulties() {
        return difficultyRepository.findAll();
    }

}
