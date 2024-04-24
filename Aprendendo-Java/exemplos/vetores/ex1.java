import java.util.Scanner;

/**
 * ex1
 */
public class ex1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("quantos números deseja armazenar no vetor?");
        int n = scan.nextInt();
        int vet[] = new int[n];
        for(int i = 0;i < vet.length;i++){
            System.out.println("Digite a posição do vetor");
            vet[i] = scan.nextInt();
        }

        for(int i = 0;i < n;i++){
            System.out.println("A posição "+i+" do vetor contem "+vet[i]);
        }
        scan.close();
    }
}