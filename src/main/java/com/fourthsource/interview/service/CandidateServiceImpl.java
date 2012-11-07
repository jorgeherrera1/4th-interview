package com.fourthsource.interview.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.interview.data.CandidateRepository;
import com.fourthsource.interview.model.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService {

    private static final Logger logger = LoggerFactory.getLogger(CandidateServiceImpl.class);
    
    @Autowired
    private CandidateRepository candidateRepository;
    
    @Override
    @Transactional(readOnly = true)
    public Page<Candidate> findAll(int page, int size) {
        logger.debug("Finding {} candidates for page {}", page, size);
        
        Pageable pageable = new PageRequest(page, size);
        Page<Candidate> candidates = candidateRepository.findAll(pageable);
        
        return candidates;
    }

}
