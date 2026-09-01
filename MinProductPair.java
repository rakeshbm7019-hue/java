import java.util.Scanner;

public class MinProductPair {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

        
            int minProduct = Integer.MAX_VALUE;
            int num1 = 0, num2 = 0;

        
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int product = arr[i] * arr[j];
                    if (product < minProduct) {
                        minProduct = product;
                        num1 = arr[i];
                        num2 = arr[j];
                    }
                }
            }

            System.out.println("Pair with minimum product: " + num1 + " " + num2);
            System.out.println("Minimum product = " + minProduct);
        }
    }
}
