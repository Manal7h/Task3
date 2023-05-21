package com.codeline.task3.Controller;

import com.codeline.task3.Model.Customer;
import com.codeline.task3.Request.CustomerRequest;
import com.codeline.task3.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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



    @RequestMapping(value = "/getAllCustomer" , method = RequestMethod.GET)
    public List<Customer> getAllCustomer() {
        List<Customer> customer = customerService.getAllCustomer();
        return customer;


    }

}
