package com.codeline.task3.Repository;

import com.codeline.task3.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("SELECT p from Product p")
    List<Product> getAllProduct();

    @Query("SELECT p from Product p where p.id= :productId")
    Product getProductById(@Param("productId") Integer id);

    @Query("select p from Product p where p.isActive = 1")
    List<Product> getAllActiveProducts();

    @Query("select p from Product p where p.isActive = 0")
    List<Product> getAllInActiveProducts();

    @Query("select p from Product p where p.inventory.id = :inventoryId")
    List<Product> getAllProductsByInventoryId(@Param("inventoryId") Integer inventoryId);
}
