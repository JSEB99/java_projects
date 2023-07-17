package AreaPeriCuadri;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero figura1;
        float lado1,lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el lado 2: "));

        if (lado1 == lado2){
            figura1 = new Cuadrilatero(lado1);
        }else{
            figura1 = new Cuadrilatero(lado1,lado2);
        }

        System.out.println("El perimetro es: "+figura1.getPerimetro());
        System.out.println("El area es: "+figura1.getArea());
    }
}
