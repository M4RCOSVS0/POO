import java.util.Scanner;

/**
 * quest12
 */
public class quest1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[10000],c=0,n;
        do{
            System.out.println("Digite um numero");
            n = scan.nextInt();
            if(n > 0){
                vet[c] = n;
                c++;
            }
        }while(n!= 0);
        for(int i = c-1;i >= 0;i--){
            System.out.println(vet[i]);
        }
        scan.close();
    }
}