package com.codeline.task3.Service;

import com.codeline.task3.Model.Inventory;
import com.codeline.task3.Model.OrderProducts;
import com.codeline.task3.Model.Product;
import com.codeline.task3.Repository.InventoryRepository;
import com.codeline.task3.Repository.OrderProductsRepository;
import com.codeline.task3.Repository.ProductRepository;
import com.codeline.task3.Request.ProductRequest;
import com.codeline.task3.Response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderProductsRepository orderProductsRepository;
    @Autowired
    InventoryRepository inventoryRepository;



    public String createProduct(ProductRequest request) {
        Product product = new Product();
        product.setProductName(request.getProductName());
        product.setPrice(request.getPrice());
        product.setQuantityAvailable(request.getQuantityAvailable());
        OrderProducts orderProducts = orderProductsRepository.findById(request.getOrderProductsId()).get();
        product.setOrderProducts(orderProducts);
        Inventory inventory = inventoryRepository.findById(request.getInventoryId()).get();
        product.setInventory(inventory);
        product.setIsActive(true);
        product.setCreatedDate(new Date());
        productRepository.save(product);
        return "Product Created Successfully";
    }

    public List<ProductResponse> getAllProduct() {
        return ProductResponse.convertToResponseList(productRepository.getAllProduct());
    }

    public ProductResponse getProductById(Integer productId) {
        Product product = productRepository.findById(productId).get();
        ProductResponse productResponse = ProductResponse.convertToResponse(product);
        return productResponse;
    }

    public void deleteProductById(ProductRequest request) {
        OrderProducts orderProducts = orderProductsRepository.findById(request.getOrderProductsId()).get();
        Product product = productRepository.findById(request.getProductId()).get();
        product.setIsActive(false);
        product.setUpdatedDate(new Date());
        productRepository.save(product);
    }


    public void upInventoryLevels(){
        List<Product> products = productRepository.findAll();

        for (Product product : products) {
            Integer inventoryLevels = product.getQuantityAvailable() - product.getOrderProducts().getQuantity();
            product.setIsActive(false);
            product.setUpdatedDate(new Date());
            productRepository.save(product);

        }
    }

}




