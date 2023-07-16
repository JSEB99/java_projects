/*
 * Escribir todos los números del 100 al 0 de 7 en 7
 */

import javax.swing.JOptionPane;

public class numerosCienACero {
    public static void main(String[] args) {
        int total=0;

        for(int i=100;i>=0;i-=7){
            total += i;
            JOptionPane.showMessageDialog(null,i);
        }

        JOptionPane.showMessageDialog(null,"La suma de todos los números es: "+total);
    }
}
