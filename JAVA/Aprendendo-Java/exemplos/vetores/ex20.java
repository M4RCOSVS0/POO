import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = 0;
    for(int j = 100;j <= 200;j++){
        n = 0;
        for(int i = 1;i <= j;i++){
            if(j % i == 0){
                n++;
            }
        }
        if(n==2){
            System.out.println(j+" primo");
        }
    }
        
    }
}