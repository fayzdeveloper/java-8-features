import java.util.stream.Stream;

public class StreamIterate {

    public static void main(String[] args) {
        // Generate a stream using Stream.iterate()
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);

        // Print the first 5 elements in the infinite stream
        System.out.println("Generate a Stream using Stream.iterate():");
        infiniteStream.limit(5).forEach(System.out::println);

        /***************
            Output: 
            0
            2
            4
            6
            8
        ***************/
    }
    
}
