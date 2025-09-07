import java.util.Scanner;
public class ex11 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o valor para receber em cédulas");
    int n1 = scan.nextInt();
    int t100 = n1 / 100;
    n1 -= t100 * 100;
    int t50 = n1 / 50;
    n1 -= t50 * 50;
    int t20 = n1 / 20;
    n1 -= t20 * 20;
    int t10 = n1 / 10;
    n1 -= t10 * 10;
    int t5 = n1 / 5;
    n1 -= t5 * 5;
    int t2 = n1 / 2;
    n1 -= t2 * 2;
    n1 /= 1;
    System.out.println("Você recebe:");
    if(t100 > 0){
        System.out.println(t100+"de 100");
    } 
    if(t50 > 0){
        System.out.println(t50+"de 50");
    } 
    if(t20 > 0){
        System.out.println(t20+"de 20");
    } 
    if(t10 > 0){
        System.out.println(t10+"de 10");
    } 
    if(t5 > 0){
        System.out.println(t5+"de 5");
    } 
    if(t2 > 0){
        System.out.println(t2+"de 2");
    } 
    if(n1 > 0){
        System.out.println(n1+"de 1");
    } 
    }
}