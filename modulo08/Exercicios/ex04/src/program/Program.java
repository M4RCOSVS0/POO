package program;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the dollar price? ");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bougth?");
        double quanty = sc.nextDouble();
        System.out.println("Amount to be paid in reais = R$"+CurrencyConverter.converter(price, quanty));
        
        
        sc.close();
    }
}
