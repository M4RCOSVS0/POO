import java.util.Scanner;

/**
 * quest2
 */
public class quest2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = scan.nextInt();
        double vet[] = new double[n],m=0,maior=0,menor=0;
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um valor");
            vet[i] = scan.nextDouble();
            m += vet[i];
            if (i == vet.length-1) {
                m /= n;
            }
        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > m) {
                maior++;
            }else if(vet[i]<m){
                menor++;
            }
        }
        System.out.println("numeros maiores "+maior);
        System.out.println("Numeros menores "+menor);
        System.out.println("Media foi "+m);
        scan.close();
    }
}