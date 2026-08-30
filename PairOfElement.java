import java.util.Scanner;

public class PairOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");

        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("All pairs of elements in the array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }

        sc.close();
    }
}
