package com.codeline.task3.Controller;

import com.codeline.task3.Request.CustomerRequest;
import com.codeline.task3.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @RequestMapping(value = "/createCustomer" , method = RequestMethod.POST)
    public String createCustomer(@RequestBody CustomerRequest request){
        try {
            customerService.createCustomer(request);
        } catch (Exception e) {
            return "Failed create";
        }
        return "create Successfully";
    }




    ////TESTING GIThUB COMMITS
}
