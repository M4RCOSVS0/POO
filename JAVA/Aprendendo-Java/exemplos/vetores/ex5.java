import java.util.Scanner;

/**
 * ex5
 */
public class ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("qual o tamanho do vetor?");
        int tam = scan.nextInt();
        int vet[] = new int[tam];
        int vetcopy[] = new int[tam];
        int check = 0;
        for(int i = 0;i < vet.length;i++){
            System.out.println("Digite um valor");
            vet[i] = scan.nextInt();
            vetcopy[i]=vet[i];
            
        }
        for (int i=0; i < vet.length; ++i){
            for (int j=i; j < vet.length; ++j){
                if (vet[i]>vet[j]){
                    int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }

        for (int j = 0; j < vetcopy.length; j++) {
            if (vet[j] == vetcopy[j]) {
                check++;
            }
        }
        if (check == tam) {
            System.out.println("está ordenado");
        }else{
            System.out.println("está desordenado");
        }
    }
}