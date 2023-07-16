/*
 * Pedir un número y calcular su factorial
 */

import javax.swing.JOptionPane;

public class factorial {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entero positivo: "));
        int resultadoFactorial = 1;

        for (int i=number;i>0;i--){
            resultadoFactorial *= i;     
        }

        JOptionPane.showMessageDialog(null, "El resultado del número "+number+" es "+resultadoFactorial);

    }
}
