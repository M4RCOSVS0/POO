import java.util.Scanner;

/**
 * ex1
 */
public class ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("quantos números deseja armazenar no vetor?");
        int n = scan.nextInt();
        int vet[] = new int[n];
        int maior1 = vet[0];
        int maior2 = 0;
        for(int i = 0;i < vet.length;i++){
            System.out.println("Digite a posição do vetor");
            vet[i] = scan.nextInt();
            if(vet[i] > maior1){
                maior2 = maior1;
                maior1 = vet[i];
            }
        }
        System.out.println("O maior e "+maior1+"\nO segundo maior e "+maior2+"A soma entre eles e "+(maior1+maior2));
        scan.close();
    }
}