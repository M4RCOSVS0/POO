import javax.swing.JOptionPane;

/**
 * quest2
 */
public class quest2 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome do funcionário");
        String salario = JOptionPane.showInputDialog("Salario de "+ nome);
        int sal = Integer.parseInt(salario);
        String desconto = JOptionPane.showInputDialog("Qual o desconto de "+ nome +" que recebe "+sal);
        int des = Integer.parseInt(desconto);
        JOptionPane.showMessageDialog(null,nome + " irá receber " + (sal-des) + " de salário liquído");

    }
}