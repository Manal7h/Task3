package com.codeline.task3.Service;
import com.codeline.task3.Model.Customer;
import com.codeline.task3.Model.OrderProducts;
import com.codeline.task3.Repository.CustomerRepository;
import com.codeline.task3.Repository.OrderProductsRepository;
import com.codeline.task3.Request.OrderProductsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;


@Service
public class OrderProductsService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderProductsRepository orderProductsRepository;


    public String createOrderProducts(OrderProductsRequest request) {
        OrderProducts orderProducts = new OrderProducts();
        orderProducts.setQuantity(request.getQuantity());
        orderProducts.setReorderThreshold(request.getReorderThreshold());
        Customer customer = customerRepository.findById(request.getCustomerId()).get();
        orderProducts.setCustomer(customer);
        orderProducts.setIsActive(true);
        orderProducts.setCreatedDate(new Date());
        orderProductsRepository.save(orderProducts);
        return "Order Created Successfully";
    }
}
