package program;

import java.util.Locale;
import java.util.Scanner;

import entietes.Pessoa1;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros vc quer digitar? ");
        int n = sc.nextInt();
        Pessoa1 vet[] = new Pessoa1[n];
        double sum1 = 0.0;
        double sum2 = 0.0;
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Digite os dados da pessoa %d\n", i+1);
            sc.nextLine();
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            sum1 += altura;
            vet[i] = new Pessoa1(nome, idade, altura);
            if (vet[i].getIdade() < 16) {
                sum2++;
            }
        }
        System.out.println("Altura media: "+ sum1/vet.length);
        System.out.printf("Pessoas com menos de 16 anos: %.1f\n", sum2/vet.length*100);
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() < 16) {
                System.out.println(vet[i].getNome());
            }
        }
        sc.close();
    }
}
