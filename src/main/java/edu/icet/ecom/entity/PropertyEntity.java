package edu.icet.ecom.entity;

import enums.ProductType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "property")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PropertyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private Integer qty;
    @Enumerated(EnumType.STRING)
    private ProductType type;
    @Column(name = "shop_id")
    private ShopEntity shop;
}
