import java.util.Scanner;

/**
 * quest1
 */
public class quest1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite tres valores aí");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        double soma = s1 + s2 + s3;
        System.out.println("A media dos tres valores é"+soma);
        
    }
}