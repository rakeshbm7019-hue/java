import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

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
}