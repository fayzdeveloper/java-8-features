import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreationPracticeAllScenarios {
    public static void main(String[] args) {
        //Stream from collection practice
        //From List
        List<String> cars = new ArrayList<>(Arrays.asList("Kia", "Thar", "Mini cooper", "Innova Crista"));
        Stream<String> carsStream = cars.stream();
        System.out.println("<- Cars Stream: ->");
        carsStream.forEach(System.out::println);

        //From List of Objects(Student)
        List<Student> studentList = new ArrayList<>(Arrays.asList(
            new Student(1, "Sam", 19),
            new Student(2, "John", 18),
            new Student(3, "Raphael", 23),
            new Student(4, "Ram", 15),
            new Student(5, "Jay", 17)
        ));
        Stream<Student> studentsStream = studentList.stream();
        System.out.println("<- Students Stream: ->");
        studentsStream.forEach(System.out::println);

        //For set
        Set<Integer> evenNumbersSet = new HashSet<>();
        evenNumbersSet.add(2);
        evenNumbersSet.add(4);
        evenNumbersSet.add(6);
        evenNumbersSet.add(8);
        evenNumbersSet.add(10);
        System.out.println("<- Even numbers Stream: ->");
        evenNumbersSet.stream().forEach(System.out::println);

        //Stream from Array practice
        //Using Stream.of()
        // From int array
        Integer[] years = {2020, 2021, 2022, 2023, 2024};
        Stream<Integer> yearsStream = Stream.of(years);
        System.out.println("<- Years Stream ->");
        yearsStream.forEach(System.out::println);

        //Array to stream using Arrays.stream()
        //from String array
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Stream<String> monthsStream = Arrays.stream(months);
        System.out.println("<- Months Stream ->");
        monthsStream.forEach(System.out::println);

        //From object array (array of student) to stream 
        Student[] students = {
            new Student(1, "Sam", 19),
            new Student(2, "John", 18),
            new Student(3, "Raphael", 23),
            new Student(4, "Ram", 15),
            new Student(5, "Jay", 17),
        };
        Stream<Student> studentStream = Arrays.stream(students);
        System.out.println("<- Student Stream ->");
        studentStream.forEach(System.out::println);

        //Stream.of() practice
        //Stream<String> example
        Stream<String> programmingLanguages = Stream.of("Java", "C", "C++", "Python", ".Net");
        System.out.println("<- Programming Language Stream ->");
        programmingLanguages.forEach(System.out::println);

        //Mixed Stream using Stream.of()
        Stream<Object> mixedStream = Stream.of("Football", 23, new Student(7, "Jim", 25), false, 'C', 123L, 23.223);
        System.out.println("<- Mixed Stream ->");
        mixedStream.forEach(System.out::println);

        //Stream.iterate() practice
        //Iterate through numbers and print till 5
        Stream<Integer> numbers = Stream.iterate(1, number -> number + 1);
        System.out.println("<- Numbers Iterate from 1 to 5 Stream ->");
        numbers.limit(5).forEach(System.out::println);

        //Iterate method with string
        Stream<String> wordIterate = Stream.iterate("A", character -> character + "B");
        System.out.println("<- String Iterate and add 'B' to seed ('A') from A to ABBBB Stream ->");
        wordIterate.limit(5).forEach(System.out::println);
    }


    //Student class
    static class Student {
        private int id;
        private String name;
        private int age;

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
        }
    }
}
