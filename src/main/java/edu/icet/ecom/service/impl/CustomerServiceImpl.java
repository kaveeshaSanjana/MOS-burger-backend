package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.CustomerDto;
import edu.icet.ecom.entity.CustomerEntity;
import edu.icet.ecom.repository.CustomerDao;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDao customerDao;
    private final ModelMapper mapper;

    @Override
    public boolean increasePoint(Double totalBill, String email) {
        return true;
    }

    @Override
    public boolean addCustomer(CustomerDto customer) {
         customerDao.save(mapper.map(customer, CustomerEntity.class));
        return true;
    }

    @Override
    public boolean updateCustomer(CustomerDto customer) {
        return addCustomer(customer);//if this is adding actually there is update
    }

    @Override
    public boolean deleteCustomer(String email) {
        customerDao.delete(new CustomerEntity(email,"",""));
        return true;
    }

    @Override
    public CustomerDto search(String id) {
        return mapper.map(customerDao.findById(id),CustomerDto.class);
    }
}
