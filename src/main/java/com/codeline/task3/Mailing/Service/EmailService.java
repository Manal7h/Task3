package com.codeline.task3.Mailing.Service;

import com.codeline.task3.Mailing.Model.EmailDetails;
import com.codeline.task3.Mailing.Repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService implements EmailRepository{

    @Autowired
    private JavaMailSender mailSender; // gives functionality to send emails, this comes from java

    @Value("${spring.mail.username}")
    private String sender;



    public String sendSimpleMail(EmailDetails details) {

        // Try block to check for exceptions
        try {

            // Creating a simple mail message
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient().get(0));
            mailMessage.setText(details.getMgBody());
            mailMessage.setSubject(details.getSubject());

            // Sending the mail
            mailSender.send(mailMessage);
            return "Mail Sent Successfully.. :)";
        }

        // Catch block to handle the exceptions
        catch (Exception e) {
            return "Error while Sending Mail Please try again :(";
        }
    }


}


