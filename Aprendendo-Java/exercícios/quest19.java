import java.util.Scanner;

/**
 * quest19
 */
public class quest19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean bol = true;
        System.out.println("Escolha dois números");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        while(bol){
            System.out.println("Escolha uma operação");
            System.out.println("1 - adição");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("a soma de "+n1+" e "+n2+" e igual a "+(n1+n2));
                    break;
                case 2:
                    System.out.println("a subtração de "+n1+" e "+n2+" e igual a "+(n1-n2));
                    break;
                case 3:
                    System.out.println("a multiplicação de "+n1+"e"+n2+"e igual a"+(n1*n2));
                    break;
                case 4:
                    System.out.println("a divisão de "+n1+" e "+n2+" e igual a"+(n1/n2));
                    break;
                default:
                    System.out.println("comando invalido!");
                    break;
                }
            System.out.println("continuar? \n1 - sim\n2 - não ");
            int op = scan.nextInt();
            if (op == 2) {
                bol = false;
            }
            
        }
            

            

    }
}