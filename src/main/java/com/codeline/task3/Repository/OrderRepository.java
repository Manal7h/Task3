package com.codeline.task3.Repository;

import com.codeline.task3.Model.Order;
import com.codeline.task3.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

//    @Query("SELECT o from Product o")
//    List<Order> getAllOrder();
//
//    @Query("SELECT o from Order o where o.id= :orderId")
//    Order getOrderById(@Param("orderId") Integer id);
}
