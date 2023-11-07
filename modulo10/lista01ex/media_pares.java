package modulo10.lista01ex;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros vc quer digitar? ");
        int n = sc.nextInt();
        int sum = 0,j = 0;
        int vet[] = new int[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Digite um numero: ");
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0) {
                sum += vet[i];
                j++;
            }
        }
        if (sum == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }else{
            System.out.println("MEDIA DOS PARES = "+ sum / j);
        }
        sc.close();
    }
}
