import java.util.Scanner;

/**
 * quest26
 */
public class quest26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("fala dois número aí");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        for(int i = 1;i<n2;i++){
            n1 *= n1;
        }
        System.out.println(n1);
        
    }
}