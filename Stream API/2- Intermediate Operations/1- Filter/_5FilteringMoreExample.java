import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _5FilteringMoreExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        // Filter words with length greater than 5 and starting with 'o'
        List<String> filteredWords = words.stream()
            .filter(word -> word.length() > 5 && word.startsWith("o"))
            .collect(Collectors.toList());

        System.out.println(filteredWords); // Output: [orange]

        List<String> values = Arrays.asList("apple", null, "banana", "", "orange", "grape");
        // Filter non-null and non-empty values
        List<String> filteredValues = values.stream()
                                            .filter(value -> value != null && !value.isEmpty())
                                            .collect(Collectors.toList());

        System.out.println(filteredValues); // Output: [apple, banana, orange, grape]
    }
}
