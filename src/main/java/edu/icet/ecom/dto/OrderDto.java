package edu.icet.ecom.dto;

import edu.icet.ecom.embeddable.OrderProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {
    private Long orderId;
    private String email;
    private List<OrderProduct> product;
    private Double credit;
}
