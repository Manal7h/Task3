package com.codeline.task3.Schedulers;

import org.springframework.beans.factory.annotation.Autowired;

public class GeneralScheduler {
    @Autowired
    DoctorService doctorService;

    @Scheduled(cron = "0 0 ? * * *")
    public void deActivateDoctor() {
        doctorService.deActivateDoctor();
    }

}
