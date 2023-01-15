import java.util.*;

public class Question1 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int sum = 0;

        for (int number : numbers){
            sum += number;
        }

        System.out.println(sum);
    }
}
