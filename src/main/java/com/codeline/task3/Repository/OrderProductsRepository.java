package com.codeline.task3.Repository;

import com.codeline.task3.Model.OrderProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface OrderProductsRepository extends JpaRepository<OrderProducts,Integer> {

    @Query("SELECT o from OrderProducts o")
    List<OrderProducts> getAllOrderProducts();

    @Query("SELECT o from OrderProducts o where o.id= :orderProductsId")
    OrderProducts getOrderProductsById(@Param("orderProductsId") Integer id);


}
