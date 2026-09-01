import java.util.*;
public class sumofeven_odd_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element ");
            arr[i] = sc.nextInt();
        }
        int sumEven = 0, sumOdd = 0, sumNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
            if (arr[i] < 0) {
                sumNegative += arr[i];
            }
        }
        System.out.println("Sum of even elements: " + sumEven);
        System.out.println("Sum of odd elements: " + sumOdd);
        System.out.println("Sum of negative elements: " + sumNegative);
        sc.close();
    }
}