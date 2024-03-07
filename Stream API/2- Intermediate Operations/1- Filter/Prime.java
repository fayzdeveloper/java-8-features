import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Prime {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 17, 12));
        List<Integer> primeNumbers = numbersList.stream().filter(number -> isPrime(number)).collect(Collectors.toList());
        System.out.println(primeNumbers);

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
    // 51 -> 51 /2 = 25
}
