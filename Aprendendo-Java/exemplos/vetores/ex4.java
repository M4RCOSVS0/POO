/**
 * ex4
 */
public class ex4 {

    public static void main(String[] args) {
        int vet1[]={2,5,6,8,3,8,1,7};
        int vet2[]={1,9,1,0,4,7,3,4};
        int vet3[]= new int[16];
        int a=0,b=0;
        for(int i = 0;i< 16;i++){
            if(i%2==0){ 
                vet3[i]= vet1[a];
                a++;
            }else{
                vet3[i]= vet2[b];
                b++;
            }
        } 
        for(int i = 0;i< 16;i++){
            System.out.println(vet3[i]);
        } 
    }
}