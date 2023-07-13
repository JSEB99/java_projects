import java.util.*;

public class sort_array {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(10);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(1);

        Collections.sort(numbers);

        System.out.println(numbers);
    }

}
