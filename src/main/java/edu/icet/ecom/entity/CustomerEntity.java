package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Customer")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerEntity {
    @Id
    private String telephone;
    @Column(nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(name = "shop_id")
    private ShopEntity shop;
}
