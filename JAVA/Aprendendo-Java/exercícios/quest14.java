import java.util.Scanner;

/**
 * quest13
 */
public class quest14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma=0,n = 0;
        Boolean bol=true;
        System.out.println("Digite o a e x");
        int a = scan.nextInt();
        while(bol){
            n = scan.nextInt(); 
            if(n <= 0){
                System.out.println("Não serve diz oto");
            }else{
                bol = false;
            }
        }
        for(int i = a;i < n+a;i++){
            soma += i;
        }
        

        System.out.println(soma);
        
    }
}