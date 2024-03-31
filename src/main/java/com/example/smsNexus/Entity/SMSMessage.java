package com.example.smsNexus.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "sms_messages")
public class SMSMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_profile_id", nullable = false)
    private  UserProfile userProfile;

    @Column(nullable = false)
    private String sender;

    @Column(name = "message_content", nullable = false)
    private String messageContent;

    @Column(nullable = false)
    private Timestamp timestamp;

    @Column(nullable = false)
    private String status;

    @Column(name = "recipient_number", nullable = false)
    private String recipientNumber;

}
