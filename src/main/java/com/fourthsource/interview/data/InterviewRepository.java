package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.fourthsource.interview.model.Interview;

@RestResource(path = "interviews")
public interface InterviewRepository extends JpaRepository<Interview, Integer> {

}
