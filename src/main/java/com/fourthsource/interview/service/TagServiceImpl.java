package com.fourthsource.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourthsource.interview.data.TagRepository;
import com.fourthsource.interview.model.Tag;

@Service
@Transactional
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;
    
    @Override
    public Tag newTag(String name, String description) {
        Tag tag = new Tag();
        tag.setName(name);
        tag.setDescription(description);
        
        return tagRepository.save(tag);
    }
    
}
