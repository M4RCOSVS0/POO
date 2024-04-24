import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero");
    int num = scan.nextInt();
    int n = 0;
    for(int i = 1;i <= num;i++){
        if(num % i == 0){
            n++;
        }
    }
    System.out.println(n == 2 ? "numero primo" : "não é primo");
    
    }
}