package edu.icet.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "supplier")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class  SupplierEntity {
    @Id
    private String telephone;
    private String name;
    private String email;
}
