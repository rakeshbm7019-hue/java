import java.util.Scanner;

public class PhoneInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        
        if (phone.matches("\\d{10}")) {
            System.out.println("Valid phone number: " + phone);
        } else {
            System.out.println("Invalid phone number");
        }

        sc.close();
    }
}
