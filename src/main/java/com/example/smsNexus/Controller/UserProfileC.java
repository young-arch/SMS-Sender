package com.example.smsNexus.Controller;
import com.example.smsNexus.Entity.UserProfile;
import com.example.smsNexus.Repository.UserProfileR;
import com.example.smsNexus.Service.UserProfileS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/user-profiles")
public class UserProfileC {
    @Autowired
    private UserProfileS userProfileService;

    @GetMapping("/{username}")
    public ResponseEntity<UserProfile> getUserProfileByUsername(@PathVariable String username) {
        UserProfile userProfile = userProfileService.findByUsername(username);
        if (userProfile != null) {
            return new ResponseEntity<>(userProfile, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<UserProfile> createUserProfile(@RequestBody UserProfile userProfile) {
        UserProfile createdUserProfile = userProfileService.save((UserProfileR) userProfile);
        return new ResponseEntity<>(createdUserProfile, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserProfileById(@PathVariable Long id) {
        userProfileService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
