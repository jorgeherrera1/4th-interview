package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.fourthsource.interview.model.Difficulty;

@RestResource(path = "difficulty")
public interface DifficultyRepository extends JpaRepository<Difficulty, Integer> {

}
