import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        double salarioHora,horasTrabajadas,salarioSemana;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite su salario por hora: ");
        salarioHora = entrada.nextDouble();
        System.out.print("Digite sus horas trabajadas: ");
        horasTrabajadas = entrada.nextDouble();

        salarioSemana = salarioHora*horasTrabajadas;

        System.out.println("Su salario semanal es:"+salarioSemana);

        entrada.close();
    }
}
