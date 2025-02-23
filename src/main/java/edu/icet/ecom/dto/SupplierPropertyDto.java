package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupplierPropertyDto {

    private SupplierDto supplier;
    private ShopPropertyDto shopProperty;
    private Integer qty;
    private Double unitPrice;
}
