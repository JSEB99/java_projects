import java.util.Scanner;

class venta_carros{
    public static void main(String[] args){
        
        float carrosVendidos,valorCarro,salarioMensual;
        salarioMensual = 1000;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite cuantos carros vendío: ");
        carrosVendidos = entrada.nextFloat();

        for(int i=1;i<=carrosVendidos;i++){
            System.out.printf("Digite el valor del carro  #%d vendido: ",i);
            valorCarro = entrada.nextFloat();
            salarioMensual += (150+(valorCarro*0.05));
        }
        entrada.close();
        System.out.println("El salario mensual del vendedor es: $"+salarioMensual+"0 usd.");

    }
}