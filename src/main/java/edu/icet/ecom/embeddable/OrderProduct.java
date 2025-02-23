package edu.icet.ecom.embeddable;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderProduct {
    private Double price;
    private Long qty;
}
