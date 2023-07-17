package Encapsulamiento;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();

        objeto1.setEdad(24);
        objeto1.setNombre("Sebastian");
        
        System.out.println("Hola mi nombre es "+objeto1.getNombre()+" y tengo "+objeto1.getEdad()+" años");
    }
}
