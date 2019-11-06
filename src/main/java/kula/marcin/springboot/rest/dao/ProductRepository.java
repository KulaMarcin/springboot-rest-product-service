package kula.marcin.springboot.rest.dao;

import kula.marcin.springboot.rest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
