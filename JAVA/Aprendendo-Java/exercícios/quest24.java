import java.util.Scanner;

/**
 * quest24
 */
public class quest24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero ai");
        int n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1;j <= i;j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1;j <= i;j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}