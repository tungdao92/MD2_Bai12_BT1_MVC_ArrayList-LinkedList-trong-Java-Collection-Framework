package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductServiceIMPL implements IProductService {
    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, 1000, "Milk"));
        productList.add(new Product(2, 2000, "Sugar"));
        productList.add(new Product(3, 900, "Oil"));
        productList.add(new Product(4, 500, "Sugar"));
    }

    @Override
    public List<Product> sortByPrice() {
        Collections.sort(productList);
        return productList;
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public List<Product> save(Product product) {
        productList.add(product);
        return productList ;
    }


    @Override
    public List<Product> remove(int id) {
        productList.remove(id -1);
        return productList;
    }


}


