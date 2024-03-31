package com.example.smsNexus.Service;

import com.example.smsNexus.Entity.MessageTemplate;
import com.example.smsNexus.Repository.MessageTemplateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageTemplateService {

    @Autowired
    private MessageTemplateRepo messageTemplateRepository;

    public MessageTemplate findByTemplateName(String templateName) {
        return messageTemplateRepository.findByTemplateName(templateName);
    }

    public MessageTemplate save(MessageTemplate messageTemplate) {
        return messageTemplateRepository.save(messageTemplate);
    }

    public void deleteById(Long id) {
        messageTemplateRepository.deleteById(id);
    }
}
