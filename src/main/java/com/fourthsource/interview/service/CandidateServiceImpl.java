package com.fourthsource.interview.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourthsource.interview.data.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService {

    private static final Logger logger = LoggerFactory.getLogger(CandidateServiceImpl.class);
    
    @Autowired
    private CandidateRepository candidateRepository;
    
    

}
