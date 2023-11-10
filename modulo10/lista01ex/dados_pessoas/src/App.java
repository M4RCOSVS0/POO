import java.util.Locale;
import java.util.Scanner;

import entietes.Dados;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros vc quer digitar? ");
        int n = sc.nextInt();
        double n1 = 0,n2 = 5,m=0,f=0,k=0;
        Dados vet[] = new Dados[n];
     
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Altura");
            double altura = sc.nextDouble();
            System.out.println("Genero ");
            char genero = sc.next().charAt(0);
            vet[i] = new Dados(genero, altura);
            if (vet[i].getAltura() > n1) {
                n1 = vet[i].getAltura();
            }
            if (vet[i].getAltura() < n2) {
                n2 = vet[i].getAltura();
            }
            if (vet[i].getSexo() == 'F') {
                f += vet[i].getAltura();
                k++;
            }
            if (vet[i].getSexo() == 'M') {
                m++;
            }
        }
        
        System.out.println("Menor altura = " +n1+"\n Maior altura = "+ n2 +"\n Media das alturas das mulheres = "+f/k+"\n     Numero de homens = "+m);

        sc.close();
    }
}
