package com.example.smsNexus.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "message_templates_association")
public class MessageTemplateAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "template_id", nullable = false)
    private MessageTemplate template;

    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;
}
