/*
 * Leer los datos correspondiente a dos tablas de 12 números
 * elemenos númericos, y mezclarlos en una tercera tabla de la
 * forma: 3 de la tabla A, 3 de la B, otros 3 de la A, otros 3
 * de la B, etc.
 */
import java.util.Scanner;

public class mezclarArreglos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arregloA[],arregloB[],arregloC[];

        arregloA = new int[12];
        arregloB = new int[12];
        arregloC = new int[24];

        for (int i=0;i<12;i++){
            System.out.print(i+" - Digite un número para el arreglo A: ");
            arregloA[i] = sc.nextInt();
            System.out.print(i+" - Digite un número para el arreglo B: ");
            arregloB[i] = sc.nextInt();
        }
        sc.close();
        int contC = 0,contArrays=0;

        for(int i=0;i<4;i++){
            System.out.println(i+contArrays);
            System.out.println(i+contC);
            arregloC[i+contC] = arregloA[i+contArrays];
            arregloC[i+1+contC] = arregloA[i+1+contArrays];
            arregloC[i+2+contC] = arregloA[i+2+contArrays];
            arregloC[i+3+contC] = arregloB[i+contArrays];
            arregloC[i+4+contC] = arregloB[i+1+contArrays];
            arregloC[i+5+contC] = arregloB[i+2+contArrays];
            contC +=5;
            contArrays += 2;
        }

        for (int i=0;i<12;i++){
            System.out.print(arregloA[i]+" ");
        }
        System.out.println();
        for (int i=0;i<12;i++){
            System.out.print(arregloB[i]+" ");
        }
        System.out.println();
        for (int i=0;i<24;i++){
            System.out.print(arregloC[i]+" ");
        }

    }
}
