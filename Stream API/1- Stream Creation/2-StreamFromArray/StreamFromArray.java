import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArray {
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] numbersArray = {1, 2, 3, 4, 5};

        // Method 1: Create a stream directly from the array using Stream.of()
        Stream<Integer> numbersStreamUsingOf = Stream.of(numbersArray);

        // Method 2: Create a stream directly from the array using Arrays.stream()
        Stream<Integer> numbersStreamUsingArrays = Arrays.stream(numbersArray);

        // Print each element in the stream created using Stream.of()
        System.out.println("Method 1 - Stream from Array:");
        numbersStreamUsingOf.forEach(number -> System.out.print(number + " "));

        // Print each element in the stream created using Arrays.stream()
        System.out.println("\n\nMethod 2 - Stream from Array using Arrays.stream():");
        numbersStreamUsingArrays.forEach(number -> System.out.print(number + " "));

        //Creating a stream of strings
        String[] wordsArray = {"apple", "banana", "orange", "grape", "kiwi"};
        Stream<String> wordsStream = Stream.of(wordsArray);

        // Print each element in the stream of strings
        System.out.println("\nCreating a Stream of Strings:");
        wordsStream.forEach(word -> System.out.print(word + " "));
    }
}
