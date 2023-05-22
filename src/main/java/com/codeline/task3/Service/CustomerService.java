package com.codeline.task3.Service;
import com.codeline.task3.Model.Customer;
import com.codeline.task3.Model.Ingredient;
import com.codeline.task3.Repository.CustomerRepository;
import com.codeline.task3.Request.CustomerRequest;
import com.codeline.task3.Request.IngredientRequest;
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





    //get All Customer
    public List<CustomerResponse> getAllCustomer() {
        return CustomerResponse.convertToResponseList(customerRepository.getAllCustomer());
    }

    public CustomerResponse getCustomerById(Integer customerId) {
        Customer customer = customerRepository.findById(customerId).get();
        CustomerResponse customerResponse = CustomerResponse.convertToResponse(customer);
        return customerResponse;
    }

    public void deleteCustomerById(CustomerRequest request) {
        Customer customer = customerRepository.findById(request.getCustomerId()).get();
        customer.setIsActive(false);
        customer.setUpdatedDate(new Date());
        customerRepository.save(customer);
    }

}
