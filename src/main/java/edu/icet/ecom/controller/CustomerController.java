package edu.icet.ecom.controller;

import edu.icet.ecom.dto.CustomerDto;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {
    final CustomerService customerService;

    @RequestMapping("/save")
    public void save(@RequestBody CustomerDto customerDto){
        customerService.addCustomer(customerDto);
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable String email){
        customerService.deleteCustomer(email);
    }

}
