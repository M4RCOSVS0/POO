import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cont = 0;
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
                cont = (mat[i][j] < 0) ? cont+1: cont;
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i] + " ");
        }
        System.out.println("Negative number = "+ cont);
    }
}
