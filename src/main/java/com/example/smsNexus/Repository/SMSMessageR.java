package com.example.smsNexus.Repository;

import com.example.smsNexus.Entity.SMSMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface SMSMessageR extends JpaRepository<SMSMessageR, Long>{
    List<SMSMessage> findBySender(String sender);
    List<SMSMessage> findByRecipientNumber(String recipientNumber);
    List<SMSMessage> findByStatus(String status);
    List<SMSMessage> findBySenderAndStatus(String sender, String status);
    List<SMSMessageR> findByTimestampBetween(Timestamp startTimestamp, Timestamp endTimestamp);

}
