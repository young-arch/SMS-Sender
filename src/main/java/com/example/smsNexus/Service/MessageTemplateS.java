package com.example.smsNexus.Service;

import com.example.smsNexus.Entity.MessageTemplate;
import com.example.smsNexus.Repository.MessageTemplateR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MessageTemplateS {

    @Autowired
    private MessageTemplateR messageTemplateRepository;

    public MessageTemplate findByTemplateName(String templateName) {
        return messageTemplateRepository.findByTemplateName(templateName);
    }

    public MessageTemplate save(MessageTemplateR messageTemplate) {
        return (MessageTemplate) messageTemplateRepository.save(messageTemplate);
    }

    public void deleteById(Long id) {
        messageTemplateRepository.deleteById(id);
    }

}
