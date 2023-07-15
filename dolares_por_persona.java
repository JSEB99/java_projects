import java.util.Scanner;

public class dolares_por_persona {
    public static void main(String[] args) {
        float usdGuillermo,usdJuan,usdLuis,total;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite los dolares que tiene Guillermo: ");
        usdGuillermo = entrada.nextFloat();
        entrada.close();

        usdLuis = usdGuillermo/2;
        usdJuan = (usdGuillermo+usdLuis)/2;

        total = usdGuillermo+usdJuan+usdLuis;

        System.out.println("El dinero en total es: $"+total+" usd");
        

    }
}
