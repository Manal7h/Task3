package com.codeline.task3.Schedulers;

import com.codeline.task3.Model.OrderProducts;
import com.codeline.task3.Model.Product;
import com.codeline.task3.Repository.OrderProductsRepository;
import com.codeline.task3.Repository.ProductRepository;
import com.codeline.task3.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
public class GeneralScheduler {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderProductsRepository orderProductsRepository;

    @Scheduled(cron = "0 0 0 * * *")
    public void upInventoryLevels() {
        List<Product> productByCreatedDate = productRepository.getAllProductByCreatedDate(new Date().toString());
        for (Product product : productByCreatedDate) {
            Integer availableQuantity = product.getQuantityAvailable();
            Integer orderedQuantity = product.getOrderProducts().getQuantity();
            Integer updatedQuantity = availableQuantity - orderedQuantity;
            OrderProducts orderProductsTotalRemainQuantity = product.getOrderProducts();
            orderProductsTotalRemainQuantity.setQuantity(updatedQuantity);
            orderProductsRepository.save(orderProductsTotalRemainQuantity);

        }

    }

}