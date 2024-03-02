import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamFromMap {

    public static void main(String[] args) {
        // Create a sample Map
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("apple", 3);
        sampleMap.put("banana", 2);
        sampleMap.put("orange", 5);
        sampleMap.put("grape", 4);

        // Convert the Map to a Stream using entrySet()
        Stream<Map.Entry<String, Integer>> entryStream = sampleMap.entrySet().stream();

        // Print each key-value pair in the stream
        System.out.println("Create a Stream from a Map using entrySet():");
        entryStream.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
    
}
