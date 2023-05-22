package com.codeline.task3.Mailing.Repository;

import com.codeline.task3.Mailing.Model.EmailDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository {


    String sendSimpleMail(EmailDetails emailDetails);


}
