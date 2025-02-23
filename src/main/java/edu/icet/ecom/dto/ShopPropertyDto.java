package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopPropertyDto {

    private Long shopPropertyId;
    private ShopDto shop;
    private PropertyDto property;
    private Double price;
}
