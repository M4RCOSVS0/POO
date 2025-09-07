package modulo10.lista01ex;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {
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
        int sum = 0,p = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > sum) {
               sum = vet[i];
               p = i;
            }
        }
        System.out.println("O maior valor = "+sum);
        System.out.println("Posicao do maior valor = "+ p);
        sc.close();
    }
}
