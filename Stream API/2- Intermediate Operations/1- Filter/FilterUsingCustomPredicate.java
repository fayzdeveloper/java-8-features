import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterUsingCustomPredicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter numbers greater than 5
        Predicate<Integer> customPredicate = num -> num > 5;

        List<Integer> filteredNumbers = numbers.stream()
            .filter(customPredicate)
            .collect(Collectors.toList());

        System.out.println(filteredNumbers); // Output: [6, 7, 8, 9, 10]

    }
}
