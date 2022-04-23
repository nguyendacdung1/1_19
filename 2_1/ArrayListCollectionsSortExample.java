package Java2_01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListCollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(2);
        numbers.add(34);
        numbers.add(4);
        numbers.add(124);

        System.out.println("before: "+numbers);

        Collections.sort(numbers);
        System.out.println("after: "+numbers);
    }
}
