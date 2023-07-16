/*
 * Leer 5 números, guardarlos en un arreglo y mostrarlos
 * en el orden inverso al introducido
 */

import java.util.Scanner;

public class leerNumerosInversos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        float numeros[] = new float[5];
        float mediaPositivos,mediaNegativos;
        int nCeros=0,nPositivos=0,nNegativos=0,totalPositivos=0,totalNegativos=0;

        for (int i=0;i<5;i++){
            System.out.print("Digite un número: ");
            numeros[i] = entrada.nextFloat();
            if (numeros[i]>0){
                nPositivos++;
                totalPositivos+=(int)numeros[i];
            }else if (numeros[i]<0){
                nNegativos++;
                totalNegativos+=(int)numeros[i];
            }else{
                nCeros++;
            }
        }

        mediaNegativos = ((float)totalNegativos)/((float)nNegativos);
        mediaPositivos = ((float)totalPositivos)/((float)nPositivos);

        entrada.close();
        System.out.println("Numeros del arreglo invertidos");
        for (float i=(numeros.length-1);i>=0;i--){
            System.out.println(numeros[(int)i]);
        }

        System.out.println("Media de los positivos: "+mediaPositivos+"\nMedia de los negativos: "+mediaNegativos+"\nCantidad de ceros: "+nCeros);
        
    }
}
