/*
 * Pedír el día, mes y año de una fecha e indicar si la fecha   
 * es correcta. Suponiendo que todos los meses son de 30 días.
 */

import javax.swing.JOptionPane;

public class fechaCorrecta {
    public static void main(String[] args) {
        int day, month, year;
        boolean correcto;

        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el día: "));
        month = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el mes: "));
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el año: "));

        correcto = true;

        if ((day>30) && (day>0)){
            correcto = false;
        }else{
            if ((month>12) && (month>0)){
                correcto = false;
            }else{
                if (year==0){
                    correcto = false;
                }
            }
        }
        if (correcto==true){
            JOptionPane.showMessageDialog(null,"La fecha "+year+"-"+month+"-"+day+" es correcta");
        }else{
            JOptionPane.showMessageDialog(null,"La fecha "+year+"-"+month+"-"+ day+" es incorrecta");
        }
    }
}
