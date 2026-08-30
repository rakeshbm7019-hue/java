import java.util.Scanner;

public class SumDivisibleElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of elements divisible by both 3 and 5:");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
