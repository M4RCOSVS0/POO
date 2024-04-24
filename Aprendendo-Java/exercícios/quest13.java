import java.util.Scanner;

/**
 * quest13
 */
public class quest13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as coordenadas x e y");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(x > 0){
            if(y > 0){
                System.out.println("primeiro");
            }else{
                System.out.println("quarto");
            }
        }else{
            if(y > 0){
                System.out.println("segundo");
            }else{
                System.out.println("terceiro");
            }
        }
    }
}