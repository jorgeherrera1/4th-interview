package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.fourthsource.interview.model.Question;

@RestResource(path = "question")
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    
    
    
}
