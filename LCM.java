public class LCM {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to find their LCM:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
          System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
      System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
