import javax.swing.*;

public class Tabuada {
    public static void main(String[] args) {
       
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para formar a tabuada: "));
        
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    
    }
}
