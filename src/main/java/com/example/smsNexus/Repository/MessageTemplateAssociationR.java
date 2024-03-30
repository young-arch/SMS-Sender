package com.example.smsNexus.Repository;

import com.example.smsNexus.Entity.MessageTemplateAssociation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageTemplateAssociationR extends JpaRepository<MessageTemplateAssociationR, Long> {
    List<MessageTemplateAssociation> findByTemplateId(Long templateId);
    List<MessageTemplateAssociation> findByMobileNumber(String mobileNumber);
}
