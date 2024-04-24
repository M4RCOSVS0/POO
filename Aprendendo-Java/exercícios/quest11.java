import javax.swing.JOptionPane;

/**
 * quest11
 */
public class quest11 {

    public static void main(String[] args) {
        int idade,maior=0;
        boolean c=true;
        String nome = "",idoso="";
        do{
            String nomes = JOptionPane.showInputDialog("nome: "); 
            nome = nomes;
            if(nome.equals("fim")){
                c=false;
                break;
            }
            String idades = JOptionPane.showInputDialog("idade: "); 
            idade = Integer.parseInt(idades);
            if(idade > maior){
                maior = idade;
                idoso = nome;
            } 
        }while(c);
        JOptionPane.showMessageDialog(null,"a pessoa mais velha é "+idoso+" com "+maior+" anos");
    }  
}