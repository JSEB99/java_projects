package ClasesPersona;

public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Metodos
    
    // Metodo constructor
    public Persona(String nombre,int edad){
        // Inicializo el nombre y edad (Los atributos)
        /*
         * Cuando se ponen igual nombre de variables que los atributos
         * java utiliza la palabra reservada this para diferenciarlos y
         * asignar el valor correctamente
         */
        this.nombre = nombre; 
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
