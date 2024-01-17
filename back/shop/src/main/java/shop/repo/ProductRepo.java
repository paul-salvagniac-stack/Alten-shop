package shop.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component; 

import shop.entities.Product;

@Component
public interface ProductRepo extends CrudRepository<Product, Long> {
    
}
