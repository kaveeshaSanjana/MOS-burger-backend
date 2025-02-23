package edu.icet.ecom.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {

    private Long orderId;
    private CustomerDto customer;
    private PropertyDto property;
    private Date date;//this has use java.util.Date
    private Double price;
}
