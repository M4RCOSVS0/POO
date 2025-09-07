import java.util.Scanner;

/**
 * quest12
 */
public class quest12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc,v1=0,v2=0,v3=0,v4=0,v5=0,v6=0;
        Boolean bol = true;
        while(bol){
            System.out.println("Urna ");
            System.out.println("1 para Lula");
            System.out.println("2 para Bolsonaro");
            System.out.println("3 para Ciro");
            System.out.println("4 para Éneas ");
            System.out.println("5 para nulo");
            System.out.println("6 para branco");
            opc = scan.nextInt();
            if(opc == 0){
                bol = false;
            }
            switch (opc) {
                case 1:
                    v1++;
                    break;
                case 2:
                    v2++;
                    break;
                case 3:
                    v3++;
                    break;
                case 4:
                    v4++;
                    break;
                case 5:
                    v5++;
                    break;
                case 6:
                    v6++;
                    break;
            
                default:
                    System.out.println("numero invalido!");
                break;
            }            
            
        }
        System.out.println("APURAÇÃO");
        System.out.println(v1+" votos para Lula");
        System.out.println(v2+" votos para Bolsonaro");
        System.out.println(v3+" votos para Ciro");
        System.out.println(v4+" votos para Éneas ");
        System.out.println(v5+" votos para nulo");
        System.out.println(v6+" votos para branco");

        
    }
}