import java.util.Scanner;

/**
 * ex1
 */
public class ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetp[] = new int[10];
        int veti[] = new int[10];
        for(int i = 0;i < 10;i++){
            System.out.println("Digite um numero ");
            int n = scan.nextInt();
            if(n%2==0){
                vetp[i] = n;
            }else{
                veti[i] = n;
            }
        }
        for(int i = 0;i < 10;i++){
            System.out.println(vetp[i]);
            System.out.println(veti[i]);
        }
        scan.close();
    }
}