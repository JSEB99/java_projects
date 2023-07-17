package SobreEscritura;

public class Persona extends Animal{

    @Override //Sobreescribiendo el código comer
    public void comer(){
        System.out.println("Estoy comiendo con cubiertos");
    }
}
