package edu.icet.ecom.service;

import edu.icet.ecom.dto.OrderDto;

import java.sql.Date;
import java.util.List;

public interface OrderService {
    boolean placeOrder(OrderDto order);
    boolean deleteOrder(Long orderId);
    List<OrderDto> searchOrder(Date date);
    List<OrderDto> searchOrder(String customer);
    OrderDto searchOrder(Long orderId);
    boolean update(OrderDto orderDto);
}
