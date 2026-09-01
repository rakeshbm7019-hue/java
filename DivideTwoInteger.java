import java.util.Scanner;

public class DivideTwoInteger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter dividend: ");
            int dividend = sc.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            DivideTwoInteger obj = new DivideTwoInteger();
            int result = obj.divide(dividend, divisor);

            System.out.println("Quotient = " + result);
        }
    }

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        while (a >= b) {
            long temp = b, multiple = 1;
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            a -= temp;
            result += multiple;
        }
        return (dividend > 0) == (divisor > 0) ? result : -result;
    }
}
