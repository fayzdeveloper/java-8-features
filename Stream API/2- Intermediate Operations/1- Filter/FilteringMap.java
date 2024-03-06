import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilteringMap {
    public static void main(String[] args) {
         // Sample Map with name and age
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 17);
        ageMap.put("Charlie", 30);
        ageMap.put("David", 15);

        // Filter the Map based on age condition and collecting to a Map
        Map<String, Integer> filteredAgeMap = ageMap.entrySet().stream()
                .filter(entry -> entry.getValue() >= 18)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredAgeMap);

        // Filter the Map based on age condition and collect names into a list
        List<String> filteredNames = ageMap.entrySet().stream()
                .filter(entry -> entry.getValue() >= 18)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
