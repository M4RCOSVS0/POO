import java.util.Scanner;
public class ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n1,n2,n3,m=0;
        System.out.println("Digite tres notas :");
        n1 = scan.nextFloat();
        n2 = scan.nextFloat();
        n3 = scan.nextFloat();
        m = (n1+n2+n3)/3;
        if(m >= 5){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}