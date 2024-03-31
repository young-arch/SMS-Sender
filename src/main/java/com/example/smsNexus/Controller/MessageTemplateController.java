package com.example.smsNexus.Controller;

import com.example.smsNexus.Entity.MessageTemplate;
import com.example.smsNexus.Service.MessageTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/message-templates")
public class MessageTemplateController {
    @Autowired
    private MessageTemplateService messageTemplateService;

    @GetMapping("/{templateName}")
    public ResponseEntity<MessageTemplate> getMessageTemplateByName(@PathVariable String templateName) {
        MessageTemplate template = messageTemplateService.findByTemplateName(templateName);
        return new ResponseEntity<>(template, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<MessageTemplate> createMessageTemplate(@RequestBody MessageTemplate messageTemplate) {
        MessageTemplate createdTemplate = messageTemplateService.save(messageTemplate);
        return new ResponseEntity<>(createdTemplate, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMessageTemplateById(@PathVariable Long id) {
        messageTemplateService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
