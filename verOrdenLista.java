/*
 * Leer 10 elementos y la app debe decirnos si estan ordenados ascendentemente
 * , descendentemente o desordenados
 */

import java.util.Scanner;

public class verOrdenLista {
    public static void main(String[] args) {
        int arreglo[];
        arreglo =new int [10];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<10;i++){
            System.out.print(i+" - Digite un número: ");
            arreglo[i] = sc.nextInt();
        }

        sc.close();
        int comparador = arreglo[0];
        boolean ascenso = false, descenso = false, desorden = false, igualdad = false;

        for (int numero:arreglo){
            if (numero > comparador){
                ascenso = true;
                if (descenso == true){
                    desorden = true;
                    break;
                }
            }else if ((numero < comparador)){
                descenso = true;
                if (ascenso == true){
                    desorden = true;
                    break;
                }
            }else{
                igualdad = true;
                if ((ascenso == true) || (descenso == true)){
                    desorden = true;
                    break;
                }
            }
        }

        if (desorden == true){
            System.out.println("Estan desordenados.");
        }else if (ascenso == true){
            System.out.println("Estan en orden ascendente.");
        }else if (descenso == true){
            System.out.println("Estan en orden descendente.");
        }else if (igualdad == true){
            System.out.println("Son todos los datos iguales.");
        }
    }
}
