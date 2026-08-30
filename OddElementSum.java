import java.util.Scanner;

public class OddElementSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");

        int N = sc.nextInt();
        int arr[] = new int[N];
    
         System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of odd elements:");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
