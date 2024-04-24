import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        if(n1 % 2 == 0){
            System.out.println(n1 + " E par!");
        }
        if(n2 % 2 == 0){
            System.out.println(n2 + " E par!");
        }

    }
}