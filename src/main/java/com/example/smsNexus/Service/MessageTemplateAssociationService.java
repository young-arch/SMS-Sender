package com.example.smsNexus.Service;

import com.example.smsNexus.Entity.MessageTemplateAssociation;
import com.example.smsNexus.Repository.MessageTemplateAssociationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageTemplateAssociationService {

    @Autowired
    private MessageTemplateAssociationRepo messageTemplateAssociationRepository;

    public List<MessageTemplateAssociation> findByTemplateId(Long templateId) {
        return messageTemplateAssociationRepository.findByTemplateId(templateId);
    }

    public List<MessageTemplateAssociation> findByMobileNumber(String mobileNumber) {
        return messageTemplateAssociationRepository.findByMobileNumber(mobileNumber);
    }

    public MessageTemplateAssociation save(MessageTemplateAssociation association) {
        return messageTemplateAssociationRepository.save(association);
    }

    public void deleteById(Long id) {
        messageTemplateAssociationRepository.deleteById(id);
    }
}
