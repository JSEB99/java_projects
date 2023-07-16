/*
 * Hacer un programa que lea por teclado y compruebe si es una letra mayúscula
 */

import javax.swing.JOptionPane;

public class verificarMayuscula {
    public static void main(String[] args) {
        
        char symbol = JOptionPane.showInputDialog("Digite un caracter a continuación: ").charAt(0);

        if (Character.isUpperCase(symbol)){
            JOptionPane.showMessageDialog(null,"La letra "+symbol+" es una letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null,"La letra "+symbol+" no es una letra mayuscula");
        }

    }
}
