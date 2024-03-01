import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamFromCollection {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        
        // Method 1: Convert the list to a stream using stream()
        Stream<String> fruitsStream1 = fruits.stream();
        
        System.out.println("Stream from List:");
        fruitsStream1.forEach(System.out::println);

        // Create a set of strings
        Set<String> countries = new HashSet<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("UK");
        countries.add("Australia");
        countries.add("Germany");

        // Create a stream from the set
        Stream<String> countriesStream = countries.stream();

        // Print each element in the stream
        System.out.println("Stream from Set:");
        countriesStream.forEach(System.out::println);
    }
}