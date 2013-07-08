package com.fourthsource.interview.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourthsource.interview.model.Tag;

public interface TagRepository extends JpaRepository<Tag, String> {
    
    
    
}
