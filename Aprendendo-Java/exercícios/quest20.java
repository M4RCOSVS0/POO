/**
 * quest20
 */
public class quest20 {

    public static void main(String[] args) {
        double soma = 0;
        for(int i = 1;i < 10;i++){
            if(i % 2 != 0){
                soma += (double)i/(i*i);  
            }else{
                soma -= (double)i/(i*i);
            }
            
            
        }
        System.out.println(soma);
    }
}