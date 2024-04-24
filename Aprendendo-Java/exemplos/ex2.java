import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("Nome do Funcionário");
        String nome = scan.next();
        System.out.println("salario do funcionário "+ nome);
        float sal = scan.nextFloat();
        System.out.println("Valor do desconto: ");
        float des = scan.nextFloat();
        System.out.println("O salario de "+nome+"é de "+sal+"e sofre um desconto de "+des+"e com isso ele recebe R$"+(sal-des));

    }
}