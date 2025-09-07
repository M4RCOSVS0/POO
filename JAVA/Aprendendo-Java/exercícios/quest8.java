import java.util.Scanner;

public class quest8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte opcao = 1;
        System.out.println("digite dois números aí");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        while (opcao != 0 && opcao <= 4) {
            System.out.println("**************");
            System.out.println("0 - sair");
            System.out.println("1 - somar");
            System.out.println("2 - substrair");
            System.out.println("3 - multiplicar");
            System.out.println("4 - dividir");
            System.out.println("**************");
            System.out.print("Digite a opção: ");
            opcao = scan.nextByte();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("A soma de n1 e n2 é "+(n1+n2));
                    break;
                case 2:
                    System.out.println("A subtração de n1 e n2 é "+(n1-n2));
                    break;
                case 3:
                    System.out.println("A multiplicação de n1 e n2 é "+(n1*n2));
                    break;
                case 4:
                    System.out.println("A divisão de n1 e n2 é "+((double) n1/n2));
                    break;
                default:
                    System.out.println("opcão invalida!");
                    break;
            }
        
    }}
    }