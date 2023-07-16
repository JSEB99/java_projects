/*
 * Orden lista mediante el metodo burbuja
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ordenListaBurbuja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[],nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tamaño de la lista: "));
        arreglo = new int[nElementos];

        for (int i=0; i<nElementos;i++){
            System.out.print(i+1+" - Digite el número: ");
            arreglo[i] = sc.nextInt();
        }
        sc.close();
        // Metodo Burbuja
        for (int i=0; i<(nElementos-1);i++){
            for (int j=0; j<(nElementos-1);j++){
                if (arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        // Mostrar el arreglo en forma creciente

        System.out.println("\nArreglo ordenado en forma creciente: ");
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" ");
        }

        System.out.println("\nArreglo en forma decreciente: ");
        for (int i=nElementos-1;i>=0;i--){
            System.out.print(arreglo[i]+" ");
        }

    }
}
