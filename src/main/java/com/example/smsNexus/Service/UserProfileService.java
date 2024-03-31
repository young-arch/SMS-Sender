package com.example.smsNexus.Service;

import com.example.smsNexus.Entity.UserProfile;
import com.example.smsNexus.Repository.UserProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepo userProfileRepository;

    public UserProfile findByUsername(String username) {
        return userProfileRepository.findByUsername(username);
    }

    public UserProfile findByEmail(String email) {
        return userProfileRepository.findByEmail(email);
    }

    public UserProfile findByPhoneNumber(String phoneNumber) {
        return userProfileRepository.findByPhoneNumber(phoneNumber);
    }

    public UserProfile save(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public void deleteById(Long id) {
        userProfileRepository.deleteById(id);
    }
}
