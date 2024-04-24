import java.util.Scanner;

/**
 * quest12
 */
public class quest3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = scan.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < c.length; i++) {
            System.out.println("valor de a");
            a[i] = scan.nextInt();
            System.out.println("valor de b");
            b[i] = scan.nextInt();
            c[i] = b[i] + a[i];
        }
        System.out.println("");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        
        scan.close();
    }
}