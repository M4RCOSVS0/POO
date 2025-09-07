import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * quest4
 */
public class quest5 {

    public static void main(String[] args) {
        int valor;
        int maior = 0;
        int menor = 999999999;
        do{  
            String leitura = JOptionPane.showInputDialog("Valor - 0 finaliza");
            valor = Integer.parseInt(leitura);
            if(valor == 0){
                break;
            }
            if (valor < 0) {
                System.out.println("O valor digitado é menor que zero");
            }
            if (valor > maior)
                maior = valor;
            if (valor < menor){
                menor = valor;    
            }
            
        }while (valor != 0);
        System.out.println("O maior valor lido foi: " + maior);
        System.out.println("O menor valor lido foi: " + menor);
    
    }
}