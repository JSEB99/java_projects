package ClasesOperacion;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        Operacion op = new Operacion();

        System.out.println("La suma es: "+op.sumarNumeros(n1,n2));
        System.out.println("La resta es: "+op.restarNumeros(n1,n2));
        System.out.println("La multiplicacion es: "+op.multiplicarNumeros(n1,n2));
        System.out.println("La resta es: "+op.dividirNumeros(n1,n2));

    }
}
