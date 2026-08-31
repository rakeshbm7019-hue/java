import java.util.*;

<<<<<<< HEAD
public class GCD{
=======
public class GCD {
>>>>>>> 4029bf90e362c173dbbb47549bf749072dd607b5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
}
