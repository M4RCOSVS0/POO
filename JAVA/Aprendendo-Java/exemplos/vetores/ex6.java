import java.util.Scanner;

/**
 * ex5
 */
public class ex6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("qual o tamanho do vetor?");
        int tam = scan.nextInt();
        int vet[] = new int[tam];
        for(int i = 0;i < vet.length;i++){
            System.out.println("Digite um valor");
            vet[i] = scan.nextInt();
            
        }
        for (int i=0; i < vet.length; ++i){
            for (int j=i; j < vet.length; ++j){
                if (vet[i]<vet[j]){
                    int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }

        for (int j = 0; j < vetcopy.length; j++) {
            System.out.println(vet[j]);
        }
    }
}