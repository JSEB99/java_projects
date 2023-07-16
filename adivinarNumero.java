/*
 * Adivinar un número entre 1 - 100, mostrar número de intentos
 */

import javax.swing.JOptionPane;

public class adivinarNumero {
    public static void main(String[] args) {
        int number,aleatorio, contador=0;

        aleatorio = (int)(Math.random()*100);

        do{
            number = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entre 1-100: "));

            if (aleatorio>number){
                JOptionPane.showMessageDialog(null, "Bajo");
            }else if (aleatorio<number){
                JOptionPane.showMessageDialog(null, "Alto");
            }
            contador++;

        }while ((number>=0) && (number<=100) && (number!=aleatorio));
            
        JOptionPane.showMessageDialog(null,"Haz adivinado, el número correcto es: "+number+"\nEn "+contador+" intentos");
    }
}
