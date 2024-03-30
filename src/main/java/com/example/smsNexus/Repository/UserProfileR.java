package com.example.smsNexus.Repository;

import com.example.smsNexus.Entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileR extends JpaRepository<UserProfileR, Long>{

    UserProfile findByUsername(String username);
    UserProfile findByEmail(String email);
    UserProfile findByPhoneNumber(String phoneNumber);
    
}
