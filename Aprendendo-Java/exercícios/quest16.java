import java.util.Scanner;

/**
 * quest15
 */
public class quest16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,i1=0,i2=0,i3=0,i4=0;
        Boolean bol = true;
        while (bol) {
            System.out.println("Digita um número ai");
            n1 = scan.nextInt();
            if (n1 < 0) {
                bol = false;
            }
            if (n1 < 25) {
                i1++;
            } else if(n1 < 50) {
                i2++;
            }else if(n1 < 75){
                i3++;
            }else if(n1 < 100){
                i4++;
            }
        }
        System.out.println("intervalos: [0,25] = "+i1+" [26,50] = "+i2+" [51,75] "+i3+" e [76,100] = "+i4);
    }
}