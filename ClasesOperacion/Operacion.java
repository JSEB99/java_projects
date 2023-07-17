package ClasesOperacion;

public class Operacion{
    // No es necesario poner siempre atributos, en esta caso tambien funcionan como variables globales
    // Metodos

    // Metodo para sumar ambos números
    public int sumarNumeros(int numero1,int numero2){
        int suma = numero1 + numero2;
        return suma;
    }
    // Metodo para restar ambos números
    public int restarNumeros(int numero1,int numero2){
        int resta = numero1 - numero2;
        return resta;
    }
    // Metodo para multiplicar ambos números
    public int multiplicarNumeros(int numero1,int numero2){
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    // Metodo para dividir ambos números
    public int dividirNumeros(int numero1,int numero2){
        int division = numero1 /numero2;
        return division;
    }
    
}