import javax.swing.JOptionPane;

/**
 * quest6
 */
public class quest6 {

    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Digite o valor de N");
        int n = Integer.parseInt(leitura);
        for(int i = 1;i <= n;i++){
            System.out.println(i);
        }
    }
}