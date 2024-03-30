package com.example.smsNexus.Repository;

import com.example.smsNexus.Entity.MessageTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageTemplateR extends JpaRepository<MessageTemplateR, Long> {
    MessageTemplate findByTemplateName(String templateName);
}
