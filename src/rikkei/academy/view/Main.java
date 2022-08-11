package rikkei.academy.view;

import java.util.Scanner;

public class Main {


    public Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Show List Product");
        System.out.println("2: CreatProduct");
        System.out.println("3: SortProduct");
        System.out.println("4: Remove");
        System.out.println("5: Search");
        System.out.println("6: Edit");
        System.out.println("7: Exit");
        int choiceMenu = scanner.nextInt();
        switch (choiceMenu){
            case 1:
                new ProductView().viewProduct();
                break;
            case 2:
                new ProductView().creatProduct();
                break;
            case 3:
                new ProductView().sortProduct();
                break;
            case 4:
                new ProductView().removeProduct();
                break;
            case 5:
                new ProductView().searchProduct();
                break;
            case 6:
                new ProductView().editProduct();
                break;
            case 7:
                System.exit(0);
                break;
            default:

        }
    }

    public static void main(String[] args) {
        new Main();

    }
}
