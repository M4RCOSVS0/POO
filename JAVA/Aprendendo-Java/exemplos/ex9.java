import java.util.Scanner;


import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano para saber se é bisexto");
        int ano = scan.nextInt();
        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("Ano " + ano + " é bisexto");
        }else{
            System.out.println("Ano " +ano+ "vnão é bisexto");
        }
    }
}