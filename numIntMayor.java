/*
 * Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10
 */

import javax.swing.JOptionPane;

public class numIntMayor {
    public static void main(String[] args) {
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entrero positivo: "));

        if (number%10 == 0){
            JOptionPane.showMessageDialog(null,"El número "+number+" es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null,"El número "+number+" no es multiplo de 10"); 
        }
    }
}
