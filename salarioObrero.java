/*
 * Un obrero necesita calcular el salario semanal, el cual
 * se obtiene de la siguiente manera:
 * - Si trabaja 40 horas o menos, se le paga $16 por hora.
 * - Si trabaja mas de 40 horas, se le paga $16 por cada una
 *   de las primeras 40 horas y $20 por cada hora extra
 */

import javax.swing.JOptionPane;

public class salarioObrero {
    public static void main(String[] args) {
        int salario;
        Integer horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las horas que trabajo (numero entero): "));

        if (horas<=40){
            salario = horas*16;
        }else{
            salario = (horas-40)*20 + (40*16);
        }

        JOptionPane.showMessageDialog(null, "El salario del obrero es $"+salario);
    }
}
