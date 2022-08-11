package rikkei.academy.view;

import rikkei.academy.controller.ProductController;
import rikkei.academy.model.Product;
import rikkei.academy.service.ProductServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static rikkei.academy.service.ProductServiceIMPL.productList;

public class ProductView {
    Scanner scanner = new Scanner(System.in);
    ProductController productController = new ProductController();
    public void viewProduct(){

        System.out.println("------STT------PRICE------NAME------");
        List<Product> productList = productController.showProduct();
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("------"+productList.get(i).getId()+" ------ " + productList.get(i).getPrice()+ "------" + productList.get(i).getName()+ "-------");
        }
        System.out.println("Enter 'back' return");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")){
            new Main();

        }

    }
    public void sortProduct(){
        System.out.println("------STT------PRICE------NAME------");
        List<Product> productList = productController.sortProduct();
        for (int i=0 ; i< productList.size(); i++){
            System.out.println("------ " + productList.get(i).getId() + " ------ " +productList.get(i).getPrice() + " ------ " + productList.get(i).getName() + "-------" );
        }
        System.out.println("Enter 'back' return");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")){
            new Main();
        }
    }

    public void creatProduct(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        List<Product> productList = productController.creatProduct(price,name);
        System.out.println("------STT------PRICE------NAME------");
        for (int i=0 ; i< productList.size(); i++){
            System.out.println("------ " + productList.get(i).getId() + " ------ " +productList.get(i).getPrice() + " ------ " + productList.get(i).getName() + "-------");
        }


    }
    public void removeProduct(){
        System.out.println("Enter id want remove: ");
        int id = scanner.nextInt();
        List<Product> productList = productController.removeProduct(id);
        System.out.println("------STT------PRICE------NAME------");
        for (int i=0 ; i< productList.size(); i++){
            System.out.println("------ " + productList.get(i).getId() + " ------ " +productList.get(i).getPrice() + " ------ " + productList.get(i).getName() + "-------");
        }

    }
    public void searchProduct(){
        System.out.println("Enter name want search: ");
        String name = scanner.nextLine();
        List<Product> products = productController.searchProduct(name);
        System.out.println("------STT------PRICE------NAME------");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("------ " + products.get(i).getId() + " ------ " + products.get(i).getPrice() + " ------ " +products.get(i).getName()+ " ------ ");

        }
    }
    public void editProduct(){
        System.out.println("Enter id want edit: ");
        int idEdit = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Enter price want edit: ");
        int priceEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name want edit");
        String nameEdit = scanner.nextLine();
        List<Product> productList = productController.editProduct(idEdit, priceEdit,nameEdit);
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("------ " + productList.get(i).getId() + " ------ " +productList.get(i).getPrice() + " ------ " + productList.get(i).getName() + "-------");
        }
    }
}
