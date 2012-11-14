package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.fourthsource.interview.model.Tag;

@RestResource(path = "tag")
public interface TagRepository extends JpaRepository<Tag, Integer> {
    
    
    
}
