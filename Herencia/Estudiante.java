package Herencia;

public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre,String apellidos,int edad,int codigoEstudiante,float notaFinal){
        super(nombre, apellidos, edad); //inicializarlos con el constructor que ya tiene la clase
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+
        "\nApellidos: "+getApellidos()+
        "\nEdad: "+getEdad()+
        "\nCodigo: "+codigoEstudiante+
        "\nNota Final: "+notaFinal);
    }

}
