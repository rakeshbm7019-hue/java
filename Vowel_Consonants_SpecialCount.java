import java.util.Scanner;
public class Vowel_Consonants_SpecialCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array:");
        String input = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (!Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of special characters: " + specialCharCount);
        sc.close();
    }
}