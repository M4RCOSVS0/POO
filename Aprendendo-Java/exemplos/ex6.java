import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome de dois programadores");
        String p1 = scan.next();
        String p2 = scan.next();
        System.out.println("Digite o salario dos programadores");
        float s1 = scan.nextFloat();
        float s2 = scan.nextFloat();
        if(s1 > s2){
            System.out.println(p1+" recebe mais que "+p2);
        }else if(s1 < s2){
            System.out.println(p2+" recebe mais que "+p1);
        }else{
            System.out.println("Salario igual");
        }

    }
}