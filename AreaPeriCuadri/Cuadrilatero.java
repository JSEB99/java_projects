package AreaPeriCuadri;

public class Cuadrilatero {
    private float lado1,lado2;

    public Cuadrilatero(float lado1,float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    // si los lados son iguales
    public Cuadrilatero(float lado){
        lado1 = lado;
        lado2 = lado1;
    }

    public float getPerimetro(){
        return 2f*(lado1+lado2);
    }
    
    public float getArea(){
        return lado1*lado2;
    }


}
