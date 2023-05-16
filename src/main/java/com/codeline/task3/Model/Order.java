package com.codeline.task3.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Orders")
public class Order extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer orderId;
    Integer quantity;
    Integer reorderThreshold;

    @ManyToOne //many order one customer
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    Customer customer;
}
