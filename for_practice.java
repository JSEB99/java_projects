import java.util.Scanner;

public class for_practice {
    /*
     * Write a program to compute sinx for given x.
     * The user should supply x and a positive integer n.
     * We compute the sine of x using the series and the computation should use
     * all terms in the series up through the term involving x^n

        sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x in radians: ");
        double x = sc.nextDouble();
        System.out.print("Enter of number of series do you want: ");
        int n = sc.nextInt();
        sc.close();

        double sin_x = 0;
        int counter = 0;

        for(int i=1;i<=n;i++){
            if (i==1){
                sin_x = x;
                counter++;
            }else if(i%2!=0){
                if (counter%2!=0){
                    //negatives
                    sin_x -= Math.pow(x, i)/factorial(i);
                    counter++;
                }else{
                    //positives
                    sin_x += Math.pow(x,i)/factorial(i);
                    counter++;
                }
            }
        }

        System.out.println("El seno de "+x+" es aproximadamente "+sin_x);
    }
    // Factorial method
    static double factorial (double numero){
        if(numero==0){
            return 1;
        }else{
            // Recursivity
            return numero*factorial(numero-1);
        }
    }
}
