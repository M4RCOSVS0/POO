package program;

import java.util.Locale;
import java.util.Scanner;

import entietes.Aluno;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        Aluno vet[] = new Aluno[n];
            for (int i = 0; i < vet.length; i++) {
                System.out.printf("Digite os dados do aluno %d\n", i+1);
                sc.nextLine();
                String nome = sc.nextLine();
                double n1 = sc.nextDouble();
                double n2 = sc.nextDouble();
                vet[i] = new Aluno(nome, n1, n2);
                
            }
            System.out.println("Alunos aprovados:");
            for (int i = 0; i < vet.length; i++) {
                if ((vet[i].getN1() + vet[i].getN2())/2 >= 6) {
                    System.out.println(vet[i].getNome());
                }
            }
                
        sc.close();
    }
}
