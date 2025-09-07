import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero para ver seu fatorial");
    int n = scan.nextInt();
    int fat = 1;
    for(int i = 1;i <= n;i++){
        fat *= i; 
    }
    System.out.println("O fatorial de "+n+" é "+fat);
    scan.close();
    }
}