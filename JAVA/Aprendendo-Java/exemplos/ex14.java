import java.rmi.dgc.DGC;
import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a hora de inicio do jogo");
    int horaI = scan.nextInt();
    System.out.println("Digite o minuto de inicio do jogo");
    int minI = scan.nextInt();
    System.out.println("Digite a hora de encerramneto do jogo");
    int horaF = scan.nextInt();
    System.out.println("Digite o minuto de encerramento do jogo");
    int minF = scan.nextInt();
    int tempo = (horaI * 60 + minI) - (horaF * 60 + minF);
    int hora = tempo / 60;
    int min = tempo - hora * 60;
    System.out.println("A duração do jogo foi "+Math.abs(hora)+":"+Math.abs(min));
    }
}