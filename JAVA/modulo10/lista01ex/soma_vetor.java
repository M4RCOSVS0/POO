package modulo10.lista01ex;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros vc quer digitar? ");
        int n = sc.nextInt();
        int vet[] = new int[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.printf("Valores :");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%d ",vet[i]);
            sum += vet[i];
        }
        System.out.println("SOMA = "+ sum+"\nMEDIA = "+ (double)sum/vet.length);
        sc.close();

    }

}
