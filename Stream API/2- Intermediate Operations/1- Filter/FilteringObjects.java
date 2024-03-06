import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringObjects {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 17),
            new Person("Charlie", 30),
            new Person("David", 15)
        );
        // Filter adults (age >= 18)
        List<Person> adults = people.stream()
            .filter(person -> person.age >= 18)
            .collect(Collectors.toList());

        System.out.println(adults);
    }

    static class Person {
        String name;
        int age;
    
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
    }
}
