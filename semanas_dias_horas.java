import java.util.Scanner;

public class semanas_dias_horas {
    public static void main(String[] args) {
        int horas,semanas,dias,horasFaltantes;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite el número de horas: ");
        horas = entrada.nextInt();
        entrada.close();

        semanas = horas / 168;
        dias = horas%168 / 24;
        horasFaltantes = horas%24;

        System.out.println("Los semanas son: "+semanas);
        System.out.println("Los días son: "+dias);
        System.out.println("Las horas son: "+horasFaltantes);

    }
}
