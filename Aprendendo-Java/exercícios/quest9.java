import java.util.Scanner;

/**
 * quest9
 */
public class quest9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pessoa,media=0;
        for(int i = 1;i<=10;i++){
            System.out.println("Digite a idade da pessoa "+i);
            pessoa = scan.nextInt();
            media += pessoa;
        }
        System.out.println("A média de idade de 10 pessoas foi "+((double)media/10));
    }
}