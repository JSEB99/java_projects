/*
 * Leer 5 elementos númericos que se introduciran ordenados de forma creciente
 * Éstos los guardaremos en una tabla de tamaño 10. Leer un número N,e insertarlo
 * en el lugar adecuado para que la tabla continúe ordenada.
 */

import java.util.Scanner;

public class insertarNumeroLista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int numeroN;

        for (int i=0;i<5;i++){
            System.out.print(i+" - Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.print("Digite el número a insertar: ");
        numeroN = entrada.nextInt();
        entrada.close();
        int posN = 0;

        for (int i=0;i<5;i++){
            if (i==4){
                posN = 5;
                break;
            }else if (numeroN < arreglo[i]){
                posN = 0;
                break;
            }else if ((numeroN>arreglo[i]) && (numeroN<arreglo[i+1])){
                posN = i+1;             
                break;
            }else{
                posN = 5;
            }
        }

        for (int i=5;i>=posN;i--){
            arreglo[i+1] = arreglo[i];
        }

        arreglo[posN] = numeroN;
        
        System.out.print("\nEl arreglo queda: ");
        for (int i=0;i<6;i++){
            System.out.print(arreglo[i]+" ");
        }



    }
}
