package com.example.smsNexus.Repository;

import com.example.smsNexus.Entity.MessageTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageTemplateRepo extends JpaRepository<MessageTemplate, Long> {
    // Method to find a message template by its name
    MessageTemplate findByTemplateName(String templateName);
}
