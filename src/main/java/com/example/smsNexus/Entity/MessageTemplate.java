package com.example.smsNexus.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "message_template")
public class MessageTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "template_name", nullable = false)
    private String templateName;

    @Column(name = "message_content")
    private String messageContent;

}
