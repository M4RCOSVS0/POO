package modulo10.Matrizes2;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();
        
        Integer[][] mat = new Integer[l][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int cont = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == cont){
                    System.out.println("Position "+i+","+j+":");
                    if (j > 0 && mat[i][j-1] != null) {
                        System.out.println("Left: "+mat[i][j-1]);
                    }
                    if (j < c-1 && mat[i][j+1] != null) {
                        System.out.println("Right: "+mat[i][j+1]);
                    }
                    if (i > 0 && mat[i-1][j] != null) {
                        System.out.println("Up: "+mat[i-1][j]);
                    }
                    if (i < l-1 && mat[i+1][j] != null) {
                        System.out.println("Down: "+mat[i+1][j]);
                    }
                } 
            }
        }
       
    }
    
}
