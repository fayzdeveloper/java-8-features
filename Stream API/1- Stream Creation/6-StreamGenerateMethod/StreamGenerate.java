import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        // Generate a stream using Stream.generate()
        Stream<Double> randomStream = Stream.generate(() -> new Random().nextDouble());

        // Print the first 5 elements in the generated stream
        System.out.println("Generate a Stream using Stream.generate():");
        randomStream.limit(5).forEach(System.out::println);

        /***********   Output  *********************
         
            Generate a Stream using Stream.generate():
            0.3746207266743593
            0.17690588467847612
            0.21528818589809529
            0.8854355504048174
            0.8134598344872

         ********************************************/
    }
}
