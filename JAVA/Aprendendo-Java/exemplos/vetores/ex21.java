import java.util.Scanner;

public class ex21 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome = "";
    String rico = "";
    int sal,grana=0;
    while(!nome.toUpperCase().equals("FIM")){
        System.out.println("Digite o nome do funcionário");
        nome = scan.next();
        if(nome.equals("fim"))  
            break;          
        System.out.println("digite o salário");
        sal = scan.nextInt();;
        if(sal > grana){
            grana = sal;
            rico = nome;
        }
    }
    JOptionPane.showMessageDialog(null,"a pessoa mais velha é com "+rico+"anos"++);
    }
}