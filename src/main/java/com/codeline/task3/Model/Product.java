package com.codeline.task3.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer productId;
    String productName;

//    List<Ingredient> ingredients;

    String price;
    Integer quantityAvailable;



    @ManyToOne // many Product to One Inventory
    @JoinColumn(name = "inventory_id", referencedColumnName = "id")
    Inventory inventory;

    @ManyToOne //many product one order
    @JoinColumn(name = "orderProducts_id", referencedColumnName = "id")
    OrderProducts orderProducts;



}
