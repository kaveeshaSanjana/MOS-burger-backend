package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.OrderDto;
import edu.icet.ecom.entity.OrderEntity;
import edu.icet.ecom.repository.OrderDao;
import edu.icet.ecom.service.CustomerService;
import edu.icet.ecom.service.OrderService;
import edu.icet.ecom.service.SendEmailService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    final OrderDao orderDao;
    final CustomerService customerService;
    final ModelMapper modelMapper;
    final SendEmailService sendEmailService;

    @Override
    public boolean placeOrder(OrderDto order) {
        orderDao.save(modelMapper.map(order,OrderEntity.class));
        boolean b = customerService.increasePoint(order.getCredit(), order.getEmail());
        sendEmailService.sendEmail("Place Order","Your order placed Success",order.getEmail());
        return b;
    }

    @Override
    public boolean deleteOrder(Long orderId) {
        orderDao.delete(new OrderEntity(orderId,"",new ArrayList<>(),0.0));
        return false;
    }

    @Override
    public List<OrderDto> searchOrder(Date date) {
        ArrayList<OrderDto> orderDtos = new ArrayList<>();
        orderDao.findAllByDate(date).forEach(orderEntity ->
                orderDtos.add(modelMapper.map(orderEntity,OrderDto.class))
        );
        return orderDtos;
    }

    @Override
    public List<OrderDto> searchOrder(String email) {
        ArrayList<OrderDto> orderDtos = new ArrayList<>();
        orderDao.findAllByEmail(email).forEach(orderEntity ->
                orderDtos.add(modelMapper.map(orderEntity,OrderDto.class))
        );
        return orderDtos;
    }

    @Override
    public OrderDto searchOrder(Long orderId) {
        return modelMapper.map(orderDao.findById(orderId),OrderDto.class);
    }

    @Override
    public boolean update(OrderDto orderDto) {
        orderDao.save(modelMapper.map(orderDto,OrderEntity.class));
        return true;
    }


}
