package com.example.smsNexus.Service;

import com.example.smsNexus.Entity.MessageTemplateAssociation;
import com.example.smsNexus.Repository.MessageTemplateAssociationR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageTemplateAssociationS {

    @Autowired
    private MessageTemplateAssociationR messageTemplateAssociationRepository;

    public List<MessageTemplateAssociation> findByTemplateId(Long templateId) {
        return messageTemplateAssociationRepository.findByTemplateId(templateId);
    }

    public List<MessageTemplateAssociation> findByMobileNumber(String mobileNumber) {
        return messageTemplateAssociationRepository.findByMobileNumber(mobileNumber);
    }

    public MessageTemplateAssociation save(MessageTemplateAssociationR association) {
        return (MessageTemplateAssociation) messageTemplateAssociationRepository.save(association);
    }

    public void deleteById(Long id) {
        messageTemplateAssociationRepository.deleteById(id);
    }
}
