package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.CustomerDto;
import edu.icet.ecom.entity.CustomerEntity;
import edu.icet.ecom.repository.CustomerDao;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDao customerDao;
    private final ModelMapper mapper;

    @Override
    public boolean increasePoint(Double totalBill, String email) {
        try {
            // Implement your logic here if needed
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean addCustomer(CustomerDto customer) {
        try {
            if (customerDao.findById(customer.getEmail()).isEmpty()) {
                customerDao.save(mapper.map(customer, CustomerEntity.class));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updateCustomer(CustomerDto customer) {
        try {
            if (customerDao.findById(customer.getEmail()).isPresent()) {
                customerDao.save(mapper.map(customer, CustomerEntity.class));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteCustomer(String email) {
        try {
            customerDao.deleteById(email);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public CustomerDto search(String id) {
        try {
            return customerDao.findById(id).map(customerEntity -> mapper.map(customerEntity, CustomerDto.class))
                    .orElse(null);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        try {
            return customerDao.findAll()
                    .stream()
                    .map(customerEntity -> mapper.map(customerEntity, CustomerDto.class))
                    .toList();
        } catch (Exception e) {
            return List.of();
        }
    }

    @Override
    public CustomerDto getCustomer(String email) {
        try {
            return mapper.map(customerDao.findById(email),CustomerDto.class);
        } catch (Exception e) {
            return null;
        }
    }
}
