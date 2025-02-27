package edu.icet.ecom.service;

import edu.icet.ecom.dto.ProductDto;

import java.util.List;

public interface ProductService {
    boolean add(ProductDto productDto);
    List<ProductDto> search(String name);
    ProductDto search(Integer id);
    boolean delete(Integer id);
    boolean update(ProductDto productDto);
}
