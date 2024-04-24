import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    for(int i = 30;i<=60;i++){
        float c = 5 * (i - 32)/9f;
        System.out.printf("%.2fC° = %dF°\n",c,i);
    }
    }
}