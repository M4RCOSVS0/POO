import java.util.Scanner;

/**
 * ex7
 */
public class ex7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salario");
        float sal = scan.nextFloat();
        if(sal < 1000){
            System.out.println("ISENTO");
        }else if(sal < 3000){
            System.out.println("será pago ao IR"+ (sal * 0.065));
        }else if(sal < 5000){
            System.out.println("será pago ao IR"+ (sal * 0.09));
        }else if(sal > 5000){
            System.out.println("será pago ao IR"+ (sal * 0.12));
        }
    }
}