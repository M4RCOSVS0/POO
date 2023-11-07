import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        double[] vect = new double[n];//vetor em java

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        
        System.out.printf("%.2f\n",sum/n);



        sc.close();
    }
}
