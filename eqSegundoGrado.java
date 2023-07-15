import java.util.Scanner;

public class eqSegundoGrado {
    public static void main(String[] args) {
        
        float a,b,c,raiz1,raiz2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite el valor de a: ");
        a = entrada.nextFloat();
        System.out.print("Digite el valor de b: ");
        b = entrada.nextFloat();
        System.out.print("Digite el valor de c: ");
        c = entrada.nextFloat();
        entrada.close();
        
        raiz1 = (float)(-b+Math.sqrt(Math.pow((double)b, 2)-(double)(4*a*c)))/(2*a);
        raiz2 = (float)(-b-Math.sqrt(Math.pow((double)b, 2)-(double)(4*a*c)))/(2*a);

        System.out.println("La raíz 1 es: "+raiz1);
        System.out.println("La raíz 2 es: "+raiz2);

    }
}
