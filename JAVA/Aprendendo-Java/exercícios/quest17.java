import java.util.Scanner;

/**
 * quest15
 */
public class quest17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s=0;
        System.out.println("numero");
        double n1 = scan.nextInt();
        for(double i = 1;i <= n1;i++){
            s += 1/i;
        }
        System.out.print("S := 1");
        for(int i = 1;i <= n1;i++){
            System.out.print(" + 1/"+i);
        }
    System.out.printf("= %.3f\n",s);    
    }
}