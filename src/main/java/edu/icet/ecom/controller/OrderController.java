package edu.icet.ecom.controller;

import edu.icet.ecom.dto.OrderDto;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
@CrossOrigin
public class OrderController {
    final OrderService orderService;

    @PostMapping("/place-order")
    public void placeOrder(@RequestBody OrderDto orderDto){
        orderService.placeOrder(orderDto);
    }

    @GetMapping("/get-by-date/{date}")
    public List<OrderDto> getAll(@PathVariable Date date){
        return orderService.searchOrder(date);
    }

    @GetMapping("/get-by-customer/{customer}")
    public List<OrderDto> getAll(@PathVariable String customer){
        return orderService.searchOrder(customer);
    }

    @GetMapping("/get-by-id/{id}")
    public OrderDto getAll(@PathVariable Long id){
        return orderService.searchOrder(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id ){
        orderService.deleteOrder(id);
    }

}
