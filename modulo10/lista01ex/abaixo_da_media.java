package modulo10.lista01ex;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros vc quer digitar? ");
        int n = sc.nextInt();
        double vet[] = new double[n];
        double sum = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Digite um numero: ");
            vet[i] = sc.nextDouble();
            sum += vet[i];
        }
        System.out.println("MEDIA DO VETOR = "+sum/vet.length);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < sum/vet.length) {
               System.out.println(vet[i]); 
            }
        }
        sc.close();
        
    }
}
