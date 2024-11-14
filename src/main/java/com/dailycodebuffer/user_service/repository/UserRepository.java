package com.dailycodebuffer.user_service.repository;

import com.dailycodebuffer.user_service.entity.UserValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserValue, Long> {

    UserValue findByUserId(Long userId);
}

