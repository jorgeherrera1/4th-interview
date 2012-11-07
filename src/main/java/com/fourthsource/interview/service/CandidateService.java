package com.fourthsource.interview.service;

import org.springframework.data.domain.Page;

import com.fourthsource.interview.model.Candidate;

public interface CandidateService {
    
    Page<Candidate> findAll(int page, int size);
    
}
