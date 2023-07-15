import java.util.Scanner;

public class cuadrado_suma {
    public static void main(String[] args) {
        double a,b,sumaCuadrados;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite el valot de a: ");
        a = entrada.nextDouble();
        System.out.print("Digite el valor de b: ");
        b = entrada.nextDouble();
        entrada.close();

        sumaCuadrados = Math.pow(a, 2)+Math.pow(b, 2)+2*a*b;

        System.out.println("La suma de cuadrados es: "+sumaCuadrados);
    }
}
