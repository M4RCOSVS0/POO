package aplication;

import java.util.Locale;
import java.util.Scanner;

import entietes.Bank;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bb;

        System.out.printf("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // Consuma a quebra de linha após o número
        System.out.printf("Enter account holder: ");
        String name = sc.nextLine(); 
        System.out.printf("Is there na initial deposit (y/n)? ");  
        char op = sc.next().charAt(0);
        
        if (op == 'y') {
            System.out.printf("Enter initial deposit value: ");
            Double saldoInicial = sc.nextDouble();
            bb = new Bank(numeroConta, name, saldoInicial);
        } else {
            bb = new Bank(numeroConta, name);
        }

        System.out.println("Account data:");
        System.out.println(bb);

        System.out.print("Enter a deposit value: ");
        Double saldo = sc.nextDouble();
        bb.addSaldo(saldo);
        System.out.println("Update Account data:");
        System.out.println(bb.toString());

        System.out.print("Enter a withdraw value: ");
        saldo = sc.nextDouble();
        bb.sacarSaldo(saldo);
        System.out.println("Update Account data:");
        System.out.println(bb.toString());

        




        sc.close();
    }
}
