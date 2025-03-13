package edu.icet.ecom.service;

import edu.icet.ecom.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    boolean increasePoint(Double credit, String email);
    boolean addCustomer(CustomerDto customer);
    boolean updateCustomer(CustomerDto customer);
    boolean deleteCustomer(String email);
    CustomerDto search(String id);
    List<CustomerDto> getAllCustomers();

    CustomerDto getCustomer(String email);
}
