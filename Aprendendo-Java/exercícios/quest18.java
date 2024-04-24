import java.util.Scanner;

/**
 * quest18
 */
public class quest18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int elevador = 0,entrou=0,saiu=0;
        System.out.println("numero de andares: ");
        int andar = scan.nextInt();
        for(int i = 1;i <= andar;i++){
            System.out.println(i+" Andar");
            if(i > 1){
                System.out.println("saiu");
                Boolean bol = true;
                while(bol){
                    saiu = scan.nextInt();
                    if(saiu <= entrou){
                        bol = false;
                    } 
                }
            }
            System.out.println("entrou");
            entrou = scan.nextInt();
            
            
            elevador = entrou - saiu;
            
            if(elevador > 15){
                System.out.println("Execesso de pessoas e necessário sair "+(elevador-15));
                elevador = 15;
            }
        }
        System.out.println("irão descer no ultimo andar "+elevador);
    }
}