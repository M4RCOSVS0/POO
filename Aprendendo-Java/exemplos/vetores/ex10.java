import java.util.Scanner;
public class ex10 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Qual seu genêro? [M/F]");
    String sexo = scan.next();
    System.out.println("Qual sua altura?");
    double h = scan.nextDouble();
    switch (sexo.toUpperCase()) {
        case "M":
            h = (h*72.7)-58;
            break;
        case "F":
            h = (66.1*h)-44.7;
            break;
        default:
            System.out.println("Só existe dois genêros");
    }
    System.out.println("Seu peso ideal é "+ h);
    }
}