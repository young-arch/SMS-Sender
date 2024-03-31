package com.example.smsNexus.Controller;

import com.example.smsNexus.Entity.SMSMessage;
import com.example.smsNexus.Service.SMSMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sms-messages")
public class SMSMessageController {
    @Autowired
    private SMSMessageService smsMessageService;

    @GetMapping("/sender/{sender}")
    public ResponseEntity<List<SMSMessage>> getMessagesBySender(@PathVariable String sender) {
        List<SMSMessage> messages = smsMessageService.findBySender(sender);
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @GetMapping("/recipient/{recipientNumber}")
    public ResponseEntity<List<SMSMessage>> getMessagesByRecipientNumber(@PathVariable String recipientNumber) {
        List<SMSMessage> messages = smsMessageService.findByRecipientNumber(recipientNumber);
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<SMSMessage>> getMessagesByStatus(@PathVariable String status) {
        List<SMSMessage> messages = smsMessageService.findByStatus(status);
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @GetMapping("/sender/{sender}/status/{status}")
    public ResponseEntity<List<SMSMessage>> getMessagesBySenderAndStatus(@PathVariable String sender,
                                                                         @PathVariable String status) {
        List<SMSMessage> messages = smsMessageService.findBySenderAndStatus(sender, status);
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<SMSMessage> createSMSMessage(@RequestBody SMSMessage smsMessage) {
        SMSMessage createdMessage = smsMessageService.save(smsMessage);
        return new ResponseEntity<>(createdMessage, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSMSMessageById(@PathVariable Long id) {
        smsMessageService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
