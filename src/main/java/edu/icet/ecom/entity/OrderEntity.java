package edu.icet.ecom.entity;

import edu.icet.ecom.embeddable.OrderProduct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Order")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ElementCollection
    @CollectionTable(name = "order_product",joinColumns = @JoinColumn(name = "orderId" ))
    @Column(name = "products")
    private List<OrderProduct> product;
    private Double credit;
}
