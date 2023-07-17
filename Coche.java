/*
 * Creación de clases
 */

public class Coche {
    // Creación de atributos
    String color;
    String marca;
    int kilometraje;

    // Metodo main
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        // Asignando atributos al objeto
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.kilometraje = 0;

        System.out.println("El color del coche 1 es: "+coche1.color);
        System.out.println("La marca del coche 1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche 1 es: "+coche1.kilometraje);

        Coche coche2 = new Coche();

        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.kilometraje = 100;

        System.out.println();
        System.out.println("El color del coche 2 es: "+coche2.color);
        System.out.println("La marca del coche 2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche 2 es: "+coche2.kilometraje);

    }

}
