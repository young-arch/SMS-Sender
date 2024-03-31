package com.example.smsNexus.Service;

import com.example.smsNexus.Entity.SMSMessage;
import com.example.smsNexus.Repository.SMSMessageRepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.sql.Timestamp;
import java.util.List;


@Service
public class SMSMessageService {
    @Autowired
    private SMSMessageRepo smsMessageRepository;

    public List<SMSMessage> findBySender(String sender) {
        return smsMessageRepository.findBySender(sender);
    }

    public List<SMSMessage> findByRecipientNumber(String recipientNumber) {
        return smsMessageRepository.findByRecipientNumber(recipientNumber);
    }

    public List<SMSMessage> findByStatus(String status) {
        return smsMessageRepository.findByStatus(status);
    }

    public List<SMSMessage> findBySenderAndStatus(String sender, String status) {
        return smsMessageRepository.findBySenderAndStatus(sender, status);
    }

    public List<SMSMessage> findByTimestampBetween(Timestamp startTimestamp, Timestamp endTimestamp) {
        return smsMessageRepository.findByTimestampBetween(startTimestamp, endTimestamp);
    }

    public SMSMessage save(SMSMessage smsMessage) {
        return smsMessageRepository.save(smsMessage);
    }

    public void deleteById(Long id) {
        smsMessageRepository.deleteById(id);
    }
}
