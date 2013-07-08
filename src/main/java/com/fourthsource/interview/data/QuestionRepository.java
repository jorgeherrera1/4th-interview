package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourthsource.interview.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    
    
    
}
