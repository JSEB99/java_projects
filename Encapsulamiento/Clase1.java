// Encapsulamiento y metodos accesores (Getters y Setters)

package Encapsulamiento;

public class Clase1 {
    private  int edad;
    private String nombre;
    // Metodo setter - establecemos edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    // Metodo getter - obtenemos edad
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}
