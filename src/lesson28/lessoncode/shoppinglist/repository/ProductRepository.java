package lesson28.lessoncode.shoppinglist.repository;

import lesson28.lessoncode.shoppinglist.dto.ProductDto;
import lesson28.lessoncode.shoppinglist.entity.Product;

import java.util.List;

public interface ProductRepository {

    Integer addProduct(ProductDto productDto);
    List<Product> findAll();
    Product findById(Integer id);
    boolean deleteById(Integer id);
}
