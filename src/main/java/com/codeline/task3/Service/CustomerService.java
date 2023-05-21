package com.codeline.task3.Service;
import com.codeline.task3.Model.Customer;
import com.codeline.task3.Repository.CustomerRepository;
import com.codeline.task3.Request.CustomerRequest;
import com.codeline.task3.Response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String createCustomer(CustomerRequest request) {
        Customer customer = new  Customer();
        customer.setCustomerName(request.getCustomerName());
        customer.setCustomerPhone(request.getCustomerPhone());
        customer.setCustomerAddress(request.getCustomerAddress());
        customer.setIsActive(true);
        customer.setCreatedDate(new Date());
        customerRepository.save(customer);
        return "Customer Created Successfully";
    }



    public CustomerResponse getCustomerById(CustomerRequest request) {
        Customer customer = customerRepository.findById(request.getCustomerId()).get();
        CustomerResponse customerResponse = CustomerResponse.convertToResponse(customer);
        return customerResponse;
    }

    //get All Customer
    public List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }


}
