import java.util.Scanner;

/**
 * quest4
 */
public class quest4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a nota final do aluno");
        float nota = scan.nextInt();
        if(nota < 5){
            System.out.println("REPROVADO KKKKKKKKKK");
        }else if(nota < 7){
            System.out.println("RECUPERAÇÃO");
        }else{
            System.out.println("APROVADO");
        }
    }
}