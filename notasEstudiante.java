import java.util.Scanner;

public class notasEstudiante {
    public static void main(String[] args) {
        float participacion,primerExamen,segundoExamen,examenFinal,total;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite su participación: ");
        participacion = entrada.nextFloat();
        System.out.print("Digite la nota del primer examen parcial: ");
        primerExamen = entrada.nextFloat();
        System.out.print("Digite la nota del segundo examen parcial: ");
        segundoExamen = entrada.nextFloat();
        System.out.print("Digite la nota del examen final: ");
        examenFinal = entrada.nextFloat();
        entrada.close();

        total = participacion*0.1f+primerExamen*0.25f+segundoExamen*0.25f+examenFinal*0.4f;

        System.out.println("La calificación del estudiante es de: "+total);
    }
}
