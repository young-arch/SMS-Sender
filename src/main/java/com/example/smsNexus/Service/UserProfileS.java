package com.example.smsNexus.Service;
import com.example.smsNexus.Entity.UserProfile;
import com.example.smsNexus.Repository.UserProfileR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserProfileS {

    @Autowired
    private UserProfileR userProfileRepository;

    public UserProfile findByUsername(String username) {
        return userProfileRepository.findByUsername(username);
    }

    public UserProfile findByEmail(String email) {
        return userProfileRepository.findByEmail(email);
    }

    public UserProfile findByPhoneNumber(String phoneNumber) {
        return userProfileRepository.findByPhoneNumber(phoneNumber);
    }

    public UserProfile save(UserProfileR userProfile) {
        return (UserProfile) userProfileRepository.save(userProfile);
    }

    public void deleteById(Long id) {
        userProfileRepository.deleteById(id);
    }

}
