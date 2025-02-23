package edu.icet.ecom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "supplier_")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupplierPropertyEntity {
    @Id
    @Column(name = "supplier_id")
    private SupplierEntity supplier;
    @Id
    @Column(name = "shop_property_id")
    private ShopPropertyEntity shopProperty;
    private Integer qty;
    private Double unitPrice;
}
