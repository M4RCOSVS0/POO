package program;

import java.util.Scanner;

import entietis.Employee;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Name: ");
        emp.name = scan.nextLine();
        System.out.print("Gross salary ");
        emp.grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        emp.tax = scan.nextDouble();
        System.out.println("Employee: "+emp.name+" $ "+emp.NetSalary());
        System.out.println("Whiche percentage to increase salary? ");
        Double percentage = scan.nextDouble();
        emp.IncreaseSalary(percentage);
        System.out.println("Update data: "+emp.name+", $ "+emp.NetSalary());

        scan.close();
    }
}
