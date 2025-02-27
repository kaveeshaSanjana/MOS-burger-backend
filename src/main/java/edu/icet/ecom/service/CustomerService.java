package edu.icet.ecom.service;

import edu.icet.ecom.dto.CustomerDto;

public interface CustomerService {
    boolean increasePoint(Double credit, String email);
    boolean addCustomer(CustomerDto customer);
    boolean updateCustomer(CustomerDto customer);
    boolean deleteCustomer(String email);
    CustomerDto search(String id);
}
