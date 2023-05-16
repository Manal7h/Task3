package com.codeline.task3.Repository;

import com.codeline.task3.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Integer> {

    @Query("SELECT i from Inventory i")
    List<Inventory> getAllInventory();

    @Query("SELECT i from Inventory i where i.id= :inventoryId")
    Inventory getInventoryById(@Param("inventoryId") Integer id);
}
