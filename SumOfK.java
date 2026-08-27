import java.util.*;

public class SumOfK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    
        System.out.print("Enter target sum k: ");
        int k = sc.nextInt();

        findPairs(arr, k);
    }

    static void findPairs(int[] arr, int k) {
        Set<Integer> seen = new HashSet<>();
        boolean found = false;
        for (int value : arr) {
            int complement = k - value;
            if (seen.contains(complement)) {
                System.out.println("Pair: " + complement + " + " + value + " = " + k);
                found = true;
            }
            seen.add(value);
        }

        if (!found) {
            System.out.println("No pairs found.");
        }
    }
}

