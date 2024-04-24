import java.util.Scanner;

/**
 * quest27
 */
public class quest27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1;
        do{
            System.out.println("Digite um numero");
            n1 = scan.nextInt(); 
            if(Math.pow(Math.round(Math.sqrt(n1)), 2) == n1 ){
                System.out.println("e um quadrado perfeito");
            }
            
        }while(n1 > 0);
        
        
    }
}