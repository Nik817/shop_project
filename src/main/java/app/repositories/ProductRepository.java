package app.repositories;

import app.domain.Product;

import java.util.List;

public interface ProductRepository {

    Product save(Product product);

    //CRUD - Create, Read, Update, Delete

    List<Product> findAll();

    Product findById(Long id);

    boolean deleteById(Long id);

    Product updateById(Product product);
}
