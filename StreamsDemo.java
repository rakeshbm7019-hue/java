import java.util.*;
import java.util.stream.*;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 4, 7, 2);

        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .distinct()
                                     .sorted()
                                     .collect(Collectors.toList());

        System.out.println("Unique even numbers: " + evens);

        int sumSquares = numbers.stream()
                                .filter(n -> n % 2 != 0)
                                .map(n -> n * n)
                                .reduce(0, Integer::sum);

        System.out.println("Sum of squares of odd numbers: " + sumSquares);

        List<String> words = Arrays.asList("apple", "banana", "pear", "apricot", "blueberry");

        List<String> filtered = words.stream()
                                     .filter(w -> w.startsWith("a"))
                                     .map(String::toUpperCase)
                                     .collect(Collectors.toList());

        System.out.println("Words starting with 'a': " + filtered);
    }
}
