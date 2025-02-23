package edu.icet.ecom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Order")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderEntity {
    @Id
    private Long orderId;
    @Column(name = "customer_id")
    private CustomerEntity customer;
    @Column(name = "property_id")
    private PropertyEntity property;
    private Date date;//this has use java.util.Date
    private Double price;
}
