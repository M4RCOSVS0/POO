import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i1,i2,i3,i4,soma=0;
        System.out.println("Digite a idade dos irmaos: ");
        i1 = scan.nextInt();
        i2 = scan.nextInt();
        i3 = scan.nextInt();
        i4 = scan.nextInt();
        if(i1 < 15 && i2 < 15 && i3 < 15 && i4 < 15){
            System.out.println("Todos são menores de 15 anos");
        }else{
            if(i1 > 15){
            soma += i1;
            }
            if(i2 > 15){
            soma += i2;
            }
            if(i3 > 15){
            soma += i3;
            }
            if(i4 > 15){
            soma += i4;
            }
        }
        System.out.println("A soma das idades é "+ soma);
    }
}