import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterPractice {
    public static void main(String[] args) {
        //Filtering Integers
        //Initializing a integer list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 123, 324, 432, 314, 145, 532);
        //Filter all even numbers
        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        //Print filtered even numbers
        System.out.println(evenNumbers);

        //Filtering String
        //Initializing a String list
        List<String> words = Arrays.asList("desk", "house", "flat", "square", "element", "piano", "rainbow");
        //Filter all words having less than or equals 4 characters
        List<String> wordsWithLessThan3Chars = words.stream().filter(word -> word.length() <= 4).collect(Collectors.toList());
        //Print filtered words with less than or equals 4 characters
        System.out.println(wordsWithLessThan3Chars);

        //Filtering Objects
        //Initializing a 
        List<Developer> developers = Arrays.asList(
            new Developer(1, "Sam", "Javascript"),
            new Developer(2, "Ronny", "Java"),
            new Developer(3, "Fayis", "Java"),
            new Developer(4, "Tom", "Python"),
            new Developer(4, "Simon", ".Net")
        );
        //Filter all java developers
        List<Developer> javaDevelopers = developers.stream().filter(developer -> developer.getDomain() == "Java").collect(Collectors.toList());
        //Print filtered java developers
        System.out.println(javaDevelopers);

        //Filtering using custom predicate
        //Initializing a String list
        List<String> flowers = Arrays.asList("rose", "lilly", "lotus", "jasmine", "hibiscus", "daisy", "marygold");
        //Custom Predicate to filter all flowers ends with E
        Predicate<String> flowersEndsWithEPredicate = word -> word.endsWith("e");
        //Filtering flowes
        List<String> filteredFlowers = flowers.stream().filter(flowersEndsWithEPredicate).collect(Collectors.toList());
        //Print filtered flowers ends with E
        System.out.println(filteredFlowers);

        //Filtering Map
        //Initializing a Map
        Map<String, String> frameworks = new HashMap<>(); 
        frameworks.put("spring", "java");
        frameworks.put("django", "python");
        frameworks.put("hibernate", "java");
        frameworks.put("flask", "python");
        frameworks.put("jsf", "java");
        
        //Filtering java frameworks and collecting into a Map
        Map<String, String> javaFrameworks = frameworks.entrySet().stream().filter(entry -> entry.getValue() == "java")
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        
        //Filtering python frameworks and collecting into a list
        List<String> pythonFrameworkList = frameworks.entrySet().stream().filter(entry -> entry.getValue() == "python")
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
        //Print filtered java frameworks
        System.out.println(javaFrameworks);
        //Print filtered python frameworks
        System.out.println(pythonFrameworkList);
    }

    static class Developer {
        private int id;
        private String name;
        private String domain;
        
		public Developer(int id, String name, String domain) {
			this.id = id;
			this.name = name;
			this.domain = domain;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDomain() {
			return domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		@Override
		public String toString() {
			return "Developer [id=" + id + ", name=" + name + ", domain=" + domain + "]";
		}
    }
}
