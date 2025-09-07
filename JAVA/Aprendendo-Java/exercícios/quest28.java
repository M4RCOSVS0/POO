import java.util.Scanner;

/**
 * icc2
 */
public class icc2 {

    public static void main(String[] args) {
        // a media pra passar e 5
        //numero maxímo de faltas 18
        Scanner scan = new Scanner(System.in);
        int sexo;
        String nome,sex;
        double n1,n2=0,n3,mm=0,mf=0,hap=0,fap=0,f=0,m=0,falt;
        int c=0;
        Boolean bol = true;
        while (bol) {
            System.out.println("Digite o sexo: \n0 - Feminino\n1 - Masculino");
            sexo = scan.nextInt();
            if (sexo != 0 && sexo != 1) {
                break;
            }
            switch (sexo) {
                case 0:
                    fap++;
                    break;
                case 1:
                    hap++;
                    break;
                default:
                    System.out.println("INVALIDO! tente novamente");
                    break;
            }
            System.out.println("idade ");
            n1 = scan.nextInt();
            if (n1 > 17 && n1 <= 35) {
                mf++;
            }
            if(sexo == 1){
                m+=n1;;
            }
            System.out.println("altura ");
            falt = scan.nextInt();
            n2 += n1;
            if(sexo == 0){
                f+=falt;
            }

            //media homi e muie
        }
        System.out.println("A media de idade é de "+((double)n2/(hap+fap)));
        System.out.println("A media de idade Masculina é de "+((double)m/hap));
        System.out.println("A media de altura feminina é de "+((double)f/fap));
        System.out.println("O percentual de pessoas com 18 3 35 é de "+((double) (mf*100)/(hap+fap)));

    }
}