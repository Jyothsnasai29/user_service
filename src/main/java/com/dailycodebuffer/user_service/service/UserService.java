package com.dailycodebuffer.user_service.service;


import com.dailycodebuffer.user_service.entity.UserValue;
import com.dailycodebuffer.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public UserValue saveUser(UserValue userValue) {
        return userRepository.save(userValue);
    }

    public UserValue getUserById(Long id) {

        return userRepository.findByUserId(id);
    }
}
