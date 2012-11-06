package com.fourthsource.interview.data;

import org.springframework.data.repository.CrudRepository;

import com.fourthsource.interview.model.Candidate;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {
    
    
    
}
