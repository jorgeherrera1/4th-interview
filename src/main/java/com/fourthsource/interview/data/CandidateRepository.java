package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourthsource.interview.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
    
    
    
}
