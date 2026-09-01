public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
    }

    static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
