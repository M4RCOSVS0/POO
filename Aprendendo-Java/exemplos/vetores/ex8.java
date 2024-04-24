import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um mes por numero: [ex 1 = jan]");
        int mes = scan.nextInt();
        switch(mes){
            case 1 | 3 | 5 | 7 | 8:
                System.out.println("31 dias");
                break;
            case 2:
                System.out.println("28 dias");
                break;
            default:
                System.out.println("30 dias");
                
        }
    }
}