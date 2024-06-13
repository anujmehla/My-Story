package com.anujmehla.My.Story.controller;

import com.anujmehla.My.Story.entity.Story;
import com.anujmehla.My.Story.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stories")
public class StoryController {


    @Autowired
    private StoryService storyService;

    @GetMapping
    public List<Story> getAllStories() {
        return storyService.findAllStories();
    }

    @GetMapping("/{id}")
    public Story getStoryById(@PathVariable Long id) {
        return storyService.findStoryById(id);
    }

    @PostMapping
    public Story createStory(@RequestBody Story story) {
        return storyService.saveStory(story);
    }

    @PutMapping("/{id}")
    public Story updateStory(@PathVariable Long id, @RequestBody Story story) {
//        story.setId(id);
        return storyService.saveStory(story);
    }

    @DeleteMapping("/{id}")
    public void deleteStory(@PathVariable Long id) {
        storyService.deleteStory(id);
    }
}
