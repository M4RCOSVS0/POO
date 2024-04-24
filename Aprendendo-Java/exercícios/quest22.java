import java.util.Scanner;

/**
 * quest22
 */
public class quest22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p=0,v=0;
        Boolean s = true;
        String opc = "",fim="";
        while(s){
            System.out.println("Sistemas de vendas da loja MODINHA");
            System.out.println("V - para transação a vista");
            System.out.println("P - para transação a prazo");
            System.out.println("M - para mostrar o total das vendas");
            System.out.println("S - para sair");
            opc = scan.nextLine();
            switch (opc) {
                case "V":
                    System.out.println("venda computada!");
                    v ++;
                    break;
                case "P":
                    System.out.println("venda computada!");
                    p++;
                    break;
                case "M":
                    System.out.println("Total de vendas a vista = "+v);
                    System.out.println("Total de vendas a prazo = "+p);
                    System.out.println("E - para Encerrar");
                    System.out.println("R - para Retornar");
                    fim = scan.nextLine();
                    if (fim.equals("E")) {
                        s = false;
                    }
                    break;
                case "S":
                    s = false;
                    break;
                default:
                    break;
            }
        }
        
        
    }
}