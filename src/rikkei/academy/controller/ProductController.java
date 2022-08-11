package rikkei.academy.controller;

import rikkei.academy.model.Product;
import rikkei.academy.service.IProductService;
import rikkei.academy.service.ProductServiceIMPL;

import java.util.List;

public class ProductController {
    private IProductService iProductService = new ProductServiceIMPL();
    public List<Product> showProduct(){
        return iProductService.findAll();
    }
    public List<Product> sortProduct(){

        return iProductService.sortByPrice();
    }
    public List<Product> creatProduct(int price, String name){
        return iProductService.save(new Product(showProduct().size() +1, price, name));
    }
    public List<Product> removeProduct(int id){
        return iProductService.remove(id);
    }
    public List<Product> searchProduct(String name){
        return iProductService.search(name);
    }
    public List<Product> editProduct(int id, int price, String name){
        return iProductService.edit(id, price, name);
    }


}
