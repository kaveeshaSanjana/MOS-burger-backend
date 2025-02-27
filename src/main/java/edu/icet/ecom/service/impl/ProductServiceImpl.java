package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.ProductDto;
import edu.icet.ecom.entity.ProductEntity;
import edu.icet.ecom.repository.ProductDao;
import edu.icet.ecom.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    final ProductDao productDao;

    public List<ProductEntity> getAll(){
        return productDao.findAll();
    }

    @Override
    public boolean add(ProductDto productDto) {
        return false;
    }

    @Override
    public List<ProductDto> search(String name) {
        return List.of();
    }

    @Override
    public ProductDto search(Integer id) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean update(ProductDto productDto) {
        return false;
    }
}
