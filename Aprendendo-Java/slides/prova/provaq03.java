import java.util.Scanner;
/**
 * provaq03
 * Aluno: MARCOS VINÍCIUS SANTANA OLIVEIRA
 */

public class provaq03 {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        int anoAntigo, mesAntigo, diaAntigo;
        int anoNovo, mesNovo, diaNovo;
        int totDia = 0;

        System.out.println("Digite a data mais antiga (dd/mm/aaaa)");
        diaAntigo = scan.nextInt();
        mesAntigo = scan.nextInt();
        anoAntigo = scan.nextInt();

        System.out.println("\nDigite a data mais recente (dd/mm/aaaa)");
        diaNovo = scan.nextInt();
        mesNovo = scan.nextInt();
        anoNovo = scan.nextInt();

        int DiaMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        
        totDia += --diaNovo;
        mesNovo--;

        while (anoAntigo < anoNovo) {
            while (mesNovo > 0) {
                totDia += DiaMes[mesNovo - 1];
                if (mesNovo == 2 && ((anoNovo % 400 == 0 || anoNovo % 100 != 0) && anoNovo % 4 == 0)) {
                    totDia ++;
                }
                mesNovo--;
            }
            anoNovo--;
            mesNovo = DiaMes.length;
        }

        do{
            totDia += DiaMes[mesNovo - 1];
            if (mesNovo == 2 &&((anoNovo % 100 != 0 || anoNovo % 400 == 0) && anoNovo % 4 == 0)) {
                totDia ++;
            }
            mesNovo--;
        }while(mesNovo >= mesAntigo);

        totDia -= --diaAntigo;

        System.out.println("Total: " + totDia + " dias");

        scan.close();
    }
}
