package com.anujmehla.My.Story.repo;

import com.anujmehla.My.Story.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
