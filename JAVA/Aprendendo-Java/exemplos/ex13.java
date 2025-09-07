import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class ex13 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digie o nome de tres jogadores");
    String name1 = scan.next();
    String name2 = scan.next();
    String name3 = scan.next();
    System.out.println("Digite o número de gols");
    int gol1 = scan.nextInt();
    int gol2 = scan.nextInt();
    int gol3 = scan.nextInt();
    if(gol1 > gol2 && gol1 > gol3){
        System.out.println("O artilheiro é "+name1+" com "+gol1+" gols");
    }else if(gol2 > gol1 && gol2 > gol3){
        System.out.println("O artilheiro é "+name2+" com "+gol2+" gols");
    }else{
        System.out.println("O artilheiro é "+name3+" com "+gol3+" gols");
    }
    }
}