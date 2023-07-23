package carro;

import java.util.Scanner;

public class Main {
    public static int indiceCarroBarato(Vehiculo carros[]){
        float precio;
        int indice = 0;

        precio = carros[0].getPrecio();

        for(int i=1;i<carros.length;i++){
            if(carros[i].getPrecio()<precio){
                precio = carros[i].getPrecio();
                indice = i;
            }
        }

        return indice;

    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numeroVehiculos,indiceCarroBarato;

        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        // Arreglo con los objetos
        Vehiculo carros[] = new Vehiculo[numeroVehiculos];

        for(int i=0;i<carros.length;i++){
            entrada.nextLine();

            System.out.println("Digite las caracteristicas del carro "+(i+1)+": ");
            System.out.print("Introduzca la marca del carro: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca el modelo del carro: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca el precio del carro: ");
            precio = entrada.nextFloat();

            carros[i] = new Vehiculo(marca, modelo, precio);
        }

        entrada.close();

        indiceCarroBarato = indiceCarroBarato(carros);
        System.out.println("\nEl carro mas barato es:\n"+carros[indiceCarroBarato].mostrarDatos());

    }
}
