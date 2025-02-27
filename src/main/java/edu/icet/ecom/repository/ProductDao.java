package edu.icet.ecom.repository;

import edu.icet.ecom.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<ProductEntity,Long> {
}
