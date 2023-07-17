package Estaticos;

public class Clase1 {
    // agregando el static el atributo pertenece a la clase y no al objeto
    private static String frase = "Primera frase";

    public static int sumar(int n1,int n2){
        int suma = n1+n2;
        return suma;
    }
    public static void main(String[] args) {
    //     Clase1 ob1 = new Clase1();
    //     Clase1 ob2 = new Clase1();

    //     ob2.frase = "Segunda frase"; // La ultima modificación afecta todos los objetos

    //     System.out.println(ob1.frase);
    //     System.out.println(ob2.frase);
    //
        System.out.println(Clase1.frase); // atributo pertenece a la clase
        System.out.println("La suma es: "+Clase1.sumar(3, 4)); // metodo estático, se llama desde la clase
    }
}
