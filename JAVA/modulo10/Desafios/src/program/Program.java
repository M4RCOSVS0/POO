package program;

import java.util.Locale;
import java.util.Scanner;

import entietes.Hospede;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int quanty = sc.nextInt();
        Hospede vet[] = new Hospede[10];
        for (int i = 0; i < quanty; i++) {
            sc.nextLine();
            System.out.println("Rent #"+(i+1));
            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Email: ");
            String email = sc.nextLine();
            System.out.printf("Room: ");
            int room = sc.nextInt();
            vet[room] = new Hospede(name, email);
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != null) {
                System.out.println(i+": "+vet[i].toString());
            }
        }

        sc.close();
    }

}
