package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Shop_Property")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopPropertyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopPropertyId;
    @Column(name = "shop_id")
    private ShopEntity shop;
    @Column(name = "property_id")
    private PropertyEntity property;
    private Double price;
}
