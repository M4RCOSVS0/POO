import java.util.Scanner;

/**
 * quest9
 */
public class quest10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pessoa,media=0,i=0;
        do{
            i++;
            System.out.println("Digite a idade da pessoa "+i);
            pessoa = scan.nextInt();
            media += pessoa;
        }while(pessoa!=0);
        System.out.println("A média de idade de "+(--i)+" pessoas foi "+((double)media/i));
    }
}