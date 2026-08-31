import java.util.*;

public class RepetedOddElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array:");

        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Common odd elements are:");

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] % 2 != 0 && arr[i] == arr1[j]) {
                    System.out.print(arr[i] + " ");
                    count++;      
                }
            }
        }

        if (count == 0) {
            System.out.println("No common odd elements found.");
        }
    }
}
