import java.util.Random;

public class random {
    public static void main(String[] args) {
        
        Random random = new Random();

        int x = random.nextInt(10); // Number between 0 and 9
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x+","+y+","+z);
    }
}
