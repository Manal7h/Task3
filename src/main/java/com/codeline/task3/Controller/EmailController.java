package com.codeline.task3.Controller;

import com.codeline.task3.Model.EmailDetails;
import com.codeline.task3.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "email")
public class EmailController {
    @Autowired
    EmailService emailService;

    // Sending a simple Email
    @PostMapping(value ="/sendMail")
    public String sendSimpleMail(@RequestBody EmailDetails emailDetails) {
        String mail = emailService.sendSimpleMail(emailDetails);

        return mail;
    }

}