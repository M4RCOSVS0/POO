package program;

import java.util.Scanner;

import entietis.Student;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student stud = new Student();
        System.out.println("Name: ");
        stud.name = scan.nextLine();
        System.out.println("3 avaliations:");
        stud.n1 = scan.nextDouble();
        stud.n2 = scan.nextDouble();
        stud.n3 = scan.nextDouble();
        stud.Situation();
        
        
        scan.close();
    }
}
