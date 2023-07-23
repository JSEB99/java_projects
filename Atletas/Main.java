package Atletas;

import java.util.Scanner;

public class Main {

    public static int indiceGanador(Atleta atletas[]){
        float tiempoMinimo;
        int indice = 0;

        tiempoMinimo = atletas[0].getTiempoAtleta();

        for(int i=0;i<atletas.length;i++){
            if(atletas[i].getTiempoAtleta()<tiempoMinimo){
                tiempoMinimo = atletas[i].getTiempoAtleta();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombreAtleta;
        int numeroAtleta,cantidadAtletas,indiceGanador;
        float tiempoAtleta;

        System.out.print("Digite la cantidad de atletas: ");
        cantidadAtletas = entrada.nextInt();

        Atleta atletas[] = new Atleta[cantidadAtletas];

        for(int i=0;i<atletas.length;i++){
            
            entrada.nextLine();
            System.out.println("Atleta numero "+(i+1)+": ");
            System.out.print("Digite el nombre del atleta: ");
            nombreAtleta = entrada.nextLine();
            System.out.print("Digite el numero del atleta: ");
            numeroAtleta = entrada.nextInt();
            System.out.print("Digite el tiempo del atleta: ");
            tiempoAtleta = entrada.nextFloat();
            

            atletas[i] = new Atleta(numeroAtleta, nombreAtleta, tiempoAtleta);
        }
        entrada.close();

        indiceGanador = indiceGanador(atletas);
        System.out.println("\nGanador:\n"+atletas[indiceGanador].mostrarDatos());

    }
}
