package program;

import java.util.Scanner;

import entietis.rectangule;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        rectangule rec = new rectangule();
        System.out.println("Enter rectangle width and heigth:");
        rec.width = scan.nextDouble();
        rec.heigth = scan.nextDouble();
        System.out.println("Area = "+rec.Area());
        System.out.println("Perimeter = "+rec.Perimeter());
        System.out.println("Diagonal = "+rec.Diagonal());
        scan.close();
    }
}
