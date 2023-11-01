package aplication;

import java.util.Locale;
import java.util.Scanner;

import entietes.Product;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Product p = new Product();
        
        System.out.println("Enter product data: ");
        System.out.println("Name ");
        String name = sc.nextLine();
        System.out.println("Price ");
        double price = sc.nextDouble();
        //System.out.println("Quantity in stock");
        //int quantity = sc.nextInt();
        
        

        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Uptade name: "+ product.getName());
        product.setPrice(1200.00);
        System.out.println("Update price: "+ product.getPrice());

        
        System.out.println("product data: "+ product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Update data: "+ product);

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: "+ product);

        sc.close();
    }
}
