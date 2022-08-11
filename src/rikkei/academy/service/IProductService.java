package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> sortByPrice();
    List<Product> findAll();
    List<Product> save (Product product);
    List<Product> remove(int id);
    List<Product> search (String name);
    List<Product> edit (int id, int price, String name);
}
