import javax.swing.JOptionPane;

/**
 * quest2
 */
public class quest3 {

    public static void main(String[] args) {
        String lado1= JOptionPane.showInputDialog("Digite tres lados de um  triângulo");
        int l1 = Integer.parseInt(lado1);
        String lado2= JOptionPane.showInputDialog("Digite tres lados de um  triângulo");
        int l2 = Integer.parseInt(lado2);
        String lado3= JOptionPane.showInputDialog("Digite tres lados de um  triângulo");
        int l3 = Integer.parseInt(lado3);

        if(l1 != l2 && l1 != l3 && l2 != l3){
            JOptionPane.showMessageDialog(null,"ESCALENO");
        }else if(l1 == l2 && l1 == l3){
            JOptionPane.showMessageDialog(null,"EQUILATERO");
        }else{
            JOptionPane.showMessageDialog(null, "ISÓSCELES");
        }
        
        //JOptionPane.showMessageDialog(null,nome + " irá receber " + (sal-des) + " de salário liquído");

    }
}