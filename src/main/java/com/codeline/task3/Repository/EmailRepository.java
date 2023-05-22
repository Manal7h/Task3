package com.codeline.task3.Repository;

import com.codeline.task3.Model.EmailDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository {


    String sendSimpleMail(EmailDetails emailDetails);


}
