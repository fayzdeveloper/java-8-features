import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names starting with 'A'
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());

        System.out.println(filteredNames); // Output: [Alice]

    }
}
