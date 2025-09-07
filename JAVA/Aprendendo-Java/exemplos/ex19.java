import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n1,s = 0;
    do{
        System.out.println("digite um número:");
        n1 = scan.nextInt();
        if(n1 % 3 == 0){
            s += n1;
        }
    }while(n1 != 0);
    System.out.println(s);
    }
}