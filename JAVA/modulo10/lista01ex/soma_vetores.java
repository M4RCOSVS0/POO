package modulo10.lista01ex;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros vc quer digitar? ");
        int n = sc.nextInt();
        int vet1[] = new int[n];
        for (int i = 0; i < vet1.length; i++) {
            System.out.printf("Digite um numero: ");
            vet1[i] = sc.nextInt();
        }
        int vet2[] = new int[n];
        for (int i = 0; i < vet2.length; i++) {
            System.out.printf("Digite um numero: ");
            vet2[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(vet1[i]+ vet2[i]);
        }
        sc.close();
    }
}
