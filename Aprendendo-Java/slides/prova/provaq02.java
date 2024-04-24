import java.util.Scanner;
/**
 * provaq02
 * Aluno: MARCOS VINÍCIUS SANTANA OLIVEIRA
 */
public class provaq02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[10];
        int rep[]= new int[21];
        int i = 0;
        do{
            System.out.println("digite um número inteiro entre 0 e 20");
            int n = scan.nextInt();
            if (n >= 0 && n <= 20) {
                vet[i] = n;
                rep[vet[i]] = rep[vet[i]] + 1;
                i++;
            } else {
               System.out.println("numero inválido tente outro"); 
            }
        }while(i < 10);

        System.out.println();

        for (int j = 0; j < rep.length; j++) {
            if(rep[j]>0 && j > 9){
                System.out.println(j+" - "+rep[j]+" vez");
            }else if(rep[j]>0 ){
                System.out.println(j+"  - "+rep[j]+" vez");
            }
        }  
       
        scan.close();
    }
}