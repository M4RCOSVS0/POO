import java.util.Scanner;

/**
 * quest15
 */
public class quest15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double peso,soma=0;
        for(int i = 0;i < 25;i++){
            System.out.println("digite o peso da caixa "+i);
            peso = scan.nextDouble();
            soma+=peso;
        }
        System.out.println("O peso total de carga é "+soma);
    }
}