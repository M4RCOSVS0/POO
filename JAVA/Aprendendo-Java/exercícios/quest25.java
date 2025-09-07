import java.util.Scanner;

/**
 * quest25
 */
public class quest25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero ai");
        int num = scan.nextInt();
        int n1=0,n2=0,n3=0,cop=0;
        cop = num;
        if(num >= 1000){
            n1 = num / 1000;
            num -= n1*1000;
        }
        if (num >= 100) {
            n2 = num / 100;
            num -= n2 * 100;
        }
        if (num >= 10) {
            n3 = num / 10;
            num -= n3 * 10;
        }

        System.out.println("O número "+cop+" vai dar como resultado "+(n1+n2+n3+num));
        
    }
}