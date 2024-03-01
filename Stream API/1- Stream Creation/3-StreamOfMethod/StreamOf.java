public class StreamOf {
    public static void main(String[] args) {
        // Generate a stream directly using Stream.of()
        Stream<String> stringStream = Stream.of("apple", "banana", "orange", "grape", "kiwi");

        // Print each element in the stream
        System.out.println("Generate a Stream using Stream.of():");
        stringStream.forEach(System.out::println);

        /*
         * Bonus: Create a stream with multiple data types
         * ------------------------------------------------
         * Stream.of() allows you to create a stream containing elements of different data types.
         * In this example, we create a mixed stream containing a String, an Integer, a Double, and a Boolean.
         */
        Stream<Object> mixedStream = Stream.of("apple", 42, 3.14, true);

        // Print each element in the mixed stream
        System.out.println("\nCreate a Stream with Multiple Data Types:");
        mixedStream.forEach(System.out::println);

        /*
         * Bonus: Create a stream from an array
         * -------------------------------------
         * You can use Stream.of() to create a stream directly from an array.
         * In this example, we create a stream of Integers from an Integer array.
         */
        Integer[] numbersArray = {1, 2, 3, 4, 5};
        Stream<Integer> numbersStream = Stream.of(numbersArray);

        // Print each element in the numbers stream
        System.out.println("\nCreate a Stream from an Array using Stream.of():");
        numbersStream.forEach(System.out::println);

        /*
         * Bonus: Create an empty stream
         * ------------------------------
         * You can create an empty stream using Stream.of().
         * This can be useful in certain scenarios where you want to represent an absence of elements in a stream.
         */
        Stream<Object> emptyStream = Stream.of();

        System.out.println("\nCreate an Empty Stream using Stream.of():");
        System.out.println("Is the stream empty? " + emptyStream.count());
    }
}
