import javax.swing.JOptionPane;

/**
 * quest6
 */
public class quest7 {

    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Digite o valor de N");
        int n = Integer.parseInt(leitura);
        for(int i = 1;i < n;i++){
            if(i % 4 == 0)
                System.out.println(i);
        }
    }
}