import java.util.*;

public class RepeatedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 20, 10, 50, 30};

        findRepeated(arr);
    }

    static void findRepeated(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                repeated.add(num);
            }
        }

        System.out.println("Repeated elements: " + repeated);
    }
}
