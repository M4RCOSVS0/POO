package modulo10.lista01ex;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros vc quer digitar? ");
        int n = sc.nextInt();
        int sum = 0;
        int vet[] = new int[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("Numeros pares:");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
               System.out.printf("%d ",vet[i]);
               sum++; 
            }
        }
        System.out.println("Quantidade de Pares: "+ sum);
        sc.close();
    }
}
