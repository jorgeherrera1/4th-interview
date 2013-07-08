package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourthsource.interview.model.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {

}
