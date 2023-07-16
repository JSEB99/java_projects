/*
 * Rotar a la derecha una lista
 */

import java.util.Scanner;

public class rotacionLista {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<10;i++){
            System.out.print(i+" - Digite un número: ");
            arreglo[i] = sc.nextInt();
        }
        sc.close();

        int numeroTemporal1=arreglo[0];
        int numeroTemporal2;

        for (int i=0;i<arreglo.length-1;i++){
            numeroTemporal2 = arreglo[i+1];
            arreglo[i+1] = numeroTemporal1;
            numeroTemporal1 = numeroTemporal2;
        }
        arreglo[0] = numeroTemporal1;
        
        for (int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }

    }
}
