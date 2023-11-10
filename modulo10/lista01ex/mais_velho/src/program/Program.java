package program;

import java.util.Locale;
import java.util.Scanner;

import entietes.Pessoa;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Pessoa vet[] = new Pessoa[n];
        int maior = 0,indice=0;
        for (int i = 0; i < vet.length; i++) {
            sc.nextLine();
            System.out.println("Dados da "+ (i+1) +"a pessoa:");
            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            System.out.printf("Idade: ");
            int idade = sc.nextInt();
            vet[i] = new Pessoa(nome, idade);
            if(vet[i].getIdade() > maior){
                maior = vet[i].getIdade();
                indice = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: "+ vet[indice].getName());
        sc.close();
    }
}
