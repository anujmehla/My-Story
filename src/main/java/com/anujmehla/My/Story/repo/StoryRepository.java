package com.anujmehla.My.Story.repo;

import com.anujmehla.My.Story.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long> {

}
