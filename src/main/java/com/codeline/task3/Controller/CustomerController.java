package com.codeline.task3.Controller;

import com.codeline.task3.Model.Customer;
import com.codeline.task3.Request.CustomerRequest;
import com.codeline.task3.Request.IngredientRequest;
import com.codeline.task3.Response.CustomerResponse;
import com.codeline.task3.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

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


    //get all the Customer (getAllCustomer)
    @RequestMapping(value = "/getAllCustomer" , method = RequestMethod.GET)
    public List<CustomerResponse> getAllCustomer() {
        List<CustomerResponse> customer = customerService.getAllCustomer();
        return customer;
    }

    @RequestMapping(value = "/getCustomerById" , method = RequestMethod.GET)
    public CustomerResponse getCustomerById(@RequestParam Integer customerId) {
       CustomerResponse customerResponse = customerService.getCustomerById(customerId);
        return customerResponse;
    }

    @RequestMapping(value = "/deleteCustomerById", method = RequestMethod.GET)
    public String deleteCustomerById(CustomerRequest customerRequest){
        try {
            customerService.deleteCustomerById(customerRequest);
        } catch (Exception e) {
            return "Failed Delete";
        }
        return "Delete Successfully";
    }



}
