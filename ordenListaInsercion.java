/*
 * Orden lista mediante el metodo de inserción
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ordenListaInsercion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[],nElementos, aux, pos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tamaño de la lista: "));
        arreglo = new int[nElementos];

        for (int i=0; i<nElementos;i++){
            System.out.print(i+1+" - Digite el número: ");
            arreglo[i] = sc.nextInt();
        }
        sc.close();
        
        // Metodo de inserción
        for (int i=0;i<nElementos;i++){
            pos = i; //iterador
            aux = arreglo[i]; //numero actual

            while ((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux; // reset

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

