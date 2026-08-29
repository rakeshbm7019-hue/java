import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 7, 5, 9};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new TreeSet<>(); // sorted output
        
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        System.out.println("Duplicates: " + duplicates);
    }
}