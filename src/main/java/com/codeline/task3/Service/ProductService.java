package com.codeline.task3.Service;
import com.codeline.task3.Model.Inventory;
import com.codeline.task3.Model.OrderProducts;
import com.codeline.task3.Model.Product;
import com.codeline.task3.Repository.InventoryRepository;
import com.codeline.task3.Repository.OrderProductsRepository;
import com.codeline.task3.Repository.ProductRepository;
import com.codeline.task3.Request.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

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


}











//    public void updateProduct(ProductRequest request) {
//        Product product = productRepository.findById(request.getId()).get();
//        product.setName(request.getName());
//        product.setIngredients(request.getIngredients());
//        product.setPrice(request.getPrice());
//        product.setQuantity(request.getQuantity());
//        Order order = orderRepository.findById(request.getOrdertId()).get();
//        product.setUpdatedDate(new Date());
//        productRepository.save(product);
//    }
//
//    public void deleteProduct(ProductRequest request) {
//        Order order = orderRepository.findById(request.getOrderId()).get();
//        Product product = productRepository.findById(request.getId()).get();
//        product.setIsActive(false);
//        product.setUpdatedDate(new Date());
//        productRepository.save(product);
//    }



