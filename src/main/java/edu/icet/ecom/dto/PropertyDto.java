package edu.icet.ecom.dto;

import enums.ProductType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PropertyDto {

    private Long productId;
    private String name;
    private Integer qty;
    private ProductType type;
    private ShopDto shop;
}
