package com.codeline.task3.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
public class Ingredient extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer ingredientId;
    String ingredientName;

    @ManyToOne //many ingredient to one product
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    Product product;

}
