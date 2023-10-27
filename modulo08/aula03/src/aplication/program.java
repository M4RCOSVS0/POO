package aplication;

import java.util.Locale;
import java.util.Scanner;

import entietes.Product;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name ");
        product.name = sc.nextLine();
        System.out.println("Price ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock");
        product.quantity = sc.nextInt();

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
