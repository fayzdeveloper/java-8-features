import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _7CodingChallenge {
    public static void main(String[] args) {
        //Challenge 1: Filter Strings by Length
        //Write a method that takes a list of strings and returns a new list containing only strings with a length 
            //greater than a specified value.
        List<String> cities = new ArrayList<>(Arrays.asList(
            "Bangalore", "Chennai", "Goa", "Coimbatore", "Kochi", "Delhi", "Chandigarh"
        ));
        List<String> citiesGreaterThan8Chars = cities.stream().filter(city -> city.length() > 8).collect(Collectors.toList());
        System.out.println(citiesGreaterThan8Chars); 

        // Challenge 2: Filter Odd Numbers
        // Write a method that takes an array of integers and returns a new list containing only the odd numbers.
        int[] numbers = {34355, 23, 42, 1, 32, 134, 435, 653, 764, 324, 9984, 4367, 32, 43};
        List<Integer> oddNumbers = Arrays.stream(numbers).filter(number -> number % 2 != 0).boxed().collect(Collectors.toList());
        System.out.println(oddNumbers);

        // Challenge 3: Filter Employees by Department
        // Create a class Employee with attributes name, age, and department. 
            // Write a method that takes a list of employees and filters out only those who belong to a specific department.
        List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Son", 29, "Sales"),
            new Employee("Mac", 25, "Marketing"),
            new Employee("John", 30, "IT"),
            new Employee("zoe", 24, "HR"),
            new Employee("Kris", 23, "IT")
        ));
        List<Employee> itEmployees = employees.stream().filter(employee -> employee.getDepartment() == "IT")
            .collect(Collectors.toList());
        System.out.println(itEmployees);

        // Challenge 4: Filter Palindromes
        // Write a method that takes a list of strings and filters out only the palindromes 
            // (words that read the same backward as forward).
        List<String> words = new ArrayList<>(Arrays.asList(
            "malayalam", "english", "kafka", "saas", "radar", "sample", "knot"
        ));
        List<String> palindromeList = words.stream().filter(word -> new StringBuilder(word).reverse().toString().equals(word))
            .collect(Collectors.toList());
        System.out.println(palindromeList);

        // Challenge 5: Filter Prime Numbers
        // Write a method that takes a list of integers and filters out only the prime numbers.
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 17, 12));
        List<Integer> primeNumbers = numbersList.stream().filter(number -> isPrime(number)).collect(Collectors.toList());
        //we can run it in single line as well
        // List<Integer> primeNumbers = numbersList.stream()
        //         .filter(number -> number > 1 && IntStream.range(2, (int) Math.sqrt(number) + 1).noneMatch(i -> number % i == 0))
        //         .collect(Collectors.toList());
        System.out.println(primeNumbers);

        // Challenge 6: Filter Students by Grade
        // Create a class Student with attributes name, grade, and age. 
            // Write a method that takes a array of students and filters out only those who have a grade above a certain threshold.

        Student[] students = {
            new Student("Yash", 24, "B"),
            new Student("Kane", 20, "A"),
            new Student("Leo", 18, "A"),
            new Student("Ram", 22, "C"),
            new Student("katy", 17, "B")
        };
        List<Student> aGradeStudents = Arrays.stream(students).filter(student -> student.getGrade() == "A")
            .collect(Collectors.toList());
        System.out.println(aGradeStudents);
        
        // Challenge 7: Filter  Unique Elements
        // Write a method that takes a list of integers and filters out only the unique elements (remove duplicates).
        List<Integer> numberesWithDuplicates = new ArrayList<>(Arrays.asList(12, 21, 12, 43, 32, 43, 12, 38, 32, 90));
        // In this implementation, the filter method is used to keep only the elements where the index of the current occurrence 
            // is the same as the last index of that element. 
            // This ensures that only unique elements are included in the final list.
        List<Integer> uniqueNumbers = numberesWithDuplicates.stream()
            .filter(number -> numberesWithDuplicates.indexOf(number) == numberesWithDuplicates.lastIndexOf(number))
            .collect(Collectors.toList());
        //For filtering unique elements, its better to use distinct method
        // List<Integer> uniqueNumbers = numberesWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);

        // Challenge 8: Filter Files by Extension
        // Write a method that takes a list of file names and filters out only those with a specific file extension.
        List<String> fileNames = new ArrayList<>(
            Arrays.asList("flower.jpg", "car.jpeg", "nature.png", "data.pdf", "index.html")
        );
        List<String> imageFiles = fileNames.stream().filter(fileName -> fileName.endsWith(".jpg") ||
            fileName.endsWith(".jpeg") || fileName.endsWith(".png")).collect(Collectors.toList());
        System.out.println(imageFiles);
    }

    private static boolean isPrime(int number) {
        boolean isPrime =  false;
        if (number == 1) {
            return false;
        }
        for (int i = number / 2; i > 1; i--) {
            if (number % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        return true;
    }

    static class Employee {
        private String name;
        private int age;
        private String department;

		public Employee(String name, int age, String department) {
			this.name = name;
			this.age = age;
			this.department = department;
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

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
		}
    }

    static class Student {
        private String name;
        private int age;
        private String grade;

		public Student(String name, int age, String grade) {
			this.name = name;
			this.age = age;
			this.grade = grade;
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

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
		}
    }
}
