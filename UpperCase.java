import java.util.Scanner;
public class UpperCase{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an array:");
            String input=sc.nextLine();
            int count=0;

            for(int i=0;i<input.length();i++){ 
                char ch= input.charAt(i);
                if(ch >= 'a' && ch <= 'z'){
                    count++;
                }
            }
            System.out.println("Number of lowercase letters: " + count);
        }
    }
}