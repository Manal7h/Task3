package com.codeline.task3.Schedulers;

import com.codeline.task3.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class GeneralScheduler {
    @Autowired
    ProductService productService;

    @Scheduled(cron = "0 0 * * * *")
    public void upInventoryLevels() {
        productService.upInventoryLevels();
    }

}