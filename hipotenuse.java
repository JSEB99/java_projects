import java.util.Scanner;

public class hipotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite el cateto adyacente: ");
        double cateto_a = sc.nextDouble();
        System.out.print("Digite el cateto opuesto: ");
        double cateto_o = sc.nextDouble();
        
        double hipotenuse = Math.sqrt(Math.pow(cateto_a, 2)+Math.pow(cateto_o, 2));

        System.out.println("La hipotenusa es: "+hipotenuse);

        sc.close();
    }
}
