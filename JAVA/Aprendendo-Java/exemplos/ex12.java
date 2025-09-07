import java.util.Scanner;
public class ex12 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Qual sua velociade na via?");
        int vel = scan.nextInt();
        System.out.println("Qual a velociade máxima da via?");
        int max = scan.nextInt();
        if(vel < max){
            System.out.println("Sem multa");
        }else if(vel <= (max + 10)){
            System.out.println("multado em R$ 50,00");
        }else if(vel <= (max + 31)){
            System.out.println("multado em R$ 100,00");
        }else{
            System.out.println("multado em R$ 200,00");
        }
    }
}