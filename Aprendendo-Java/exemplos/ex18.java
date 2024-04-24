import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double lucas = 1.20;
    double tulio = 1.10;
    int i = 0;
    while(lucas > tulio){
        i++;
        lucas += 0.02;
        tulio += 0.03;
    }
    System.out.println("em "+i+" anos");
    }
}