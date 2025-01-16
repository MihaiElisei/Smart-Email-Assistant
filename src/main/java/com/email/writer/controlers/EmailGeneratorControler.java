package com.email.writer.controlers;

import com.email.writer.entity.EmailRequest;
import com.email.writer.service.EmailGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGeneratorControler {

    private final EmailGeneratorService emailGeneratorService;

    public EmailGeneratorControler(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail (@RequestBody EmailRequest emailRequest){
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
