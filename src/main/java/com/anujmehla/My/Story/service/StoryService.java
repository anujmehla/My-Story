package com.anujmehla.My.Story.service;

import com.anujmehla.My.Story.entity.Story;
import com.anujmehla.My.Story.repo.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {

    @Autowired
    private StoryRepository storyRepository;

    public List<Story> findAllStories() {
        return storyRepository.findAll();
    }

    public Story findStoryById(Long id) {
        return storyRepository.findById(id).orElse(null);
    }

    public Story saveStory(Story story) {
        return storyRepository.save(story);
    }

    public void deleteStory(Long id) {
        storyRepository.deleteById(id);
    }

}
