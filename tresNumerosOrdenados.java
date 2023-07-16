/*
 * Pedir 3 números y mostrarlos ordenados de mayor a menor
 */

import javax.swing.JOptionPane;

public class tresNumerosOrdenados {
    public static void main(String[] args) {
        int number1, number2, number3, maxNum, maxNum2,minNum;

        maxNum = 0;
        maxNum2 = 0;
        minNum = 0;
        number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer número: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo número: "));
        number3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tercer número: "));

        if ((number1>number2) && (number1>number3)){
            maxNum = number1;
            if ((number2>number3) | (number2 == number3)){
                maxNum2 = number2;
                minNum = number3;
            }else{
                maxNum2 = number3;
                minNum = number2;
            }
        }else if ((number2>number1) && (number2>number3)){
            maxNum = number2;
            if ((number1>number3) | (number1==number3)){
                maxNum2 = number1;
                minNum = number3;
            }else {
                maxNum2 = number3;
                minNum = number1;
            }
        }else if ((number3>number2) && (number3>number1)){
            maxNum = number3;
            if ((number2>number1) | (number2 == number1)){
                maxNum2 = number2;
                minNum = number1;
            }else{
                maxNum2 = number1;
                minNum = number2;
            }
        }else{
            maxNum=maxNum2=minNum=number1;
        }
        JOptionPane.showMessageDialog(null, "Los números ordenados son: \n1er- "+maxNum+"\n"+"2do- "+maxNum2+"\n"+"3er- "+minNum);
    }
}
