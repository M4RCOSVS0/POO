import java.util.Scanner;
import java.util.Random;

/**
 * quest23
 */
public class quest23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n1,n2,cont=0;
        n1 = random.nextInt(100)+1;
        do{
            cont++;
            System.out.println("Digite o numero premiado"+n1);
            n2 = scan.nextInt();
            if(n1 == n2){
                System.out.println("Acertou!");
            }else if(n1 > n2){
                System.out.println("chute mais alto");
            }else{
                System.out.println("chute mais baixo");
            }
        }while(n1!=n2);
        System.out.println("foi necessário "+cont+"tentativas");
    }
}