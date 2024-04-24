import java.util.Scanner;

/**
 * ex5
 */
public class ex7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[10];
        int rep[] = new int[10];
        int aux=0;
        int counter=0;
        int r=0;

        for(int i = 0;i < vet.length;i++){
            System.out.println("Digite um valor");
            vet[i] = scan.nextInt();
            
        }
        for (int i=0; i < vet.length; ++i){
            for (int j=i+1; j < vet.length; ++j){
                if (vet[i] == vet[j]){
                        rep[aux] = vet[j];
                        aux++;
                    }
                    
                }
            }
        if (aux > 0) {
            System.out.println("tem numero igual sendo eles");
            for (int i = 0; i < aux; i++) {
                System.out.println(rep[i]);
            }
        } else {
            System.out.println("não tem numero igual");
        } 
        //System.out.println(aux);
        

       
   
    }
}