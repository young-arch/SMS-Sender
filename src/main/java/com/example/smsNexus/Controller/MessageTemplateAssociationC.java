package com.example.smsNexus.Controller;
import com.example.smsNexus.Entity.MessageTemplateAssociation;
import com.example.smsNexus.Service.MessageTemplateAssociationS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/message-template-associations")
public class MessageTemplateAssociationC {
    @Autowired
    private MessageTemplateAssociationS messageTemplateAssociationService;

    @GetMapping("/template/{templateId}")
    public ResponseEntity<List<MessageTemplateAssociation>> getAssociationsByTemplateId(@PathVariable Long templateId) {
        List<MessageTemplateAssociation> associations = messageTemplateAssociationService.findByTemplateId(templateId);
        return new ResponseEntity<>(associations, HttpStatus.OK);
    }

    @GetMapping("/mobile/{mobileNumber}")
    public ResponseEntity<List<MessageTemplateAssociation>> getAssociationsByMobileNumber(@PathVariable String mobileNumber) {
        List<MessageTemplateAssociation> associations = messageTemplateAssociationService.findByMobileNumber(mobileNumber);
        return new ResponseEntity<>(associations, HttpStatus.OK);
    }


}
