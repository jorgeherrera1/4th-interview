package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.fourthsource.interview.model.Candidate;

@RestResource(path = "candidate")
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
    
    
    
}
