import java.util.*;
public class fibonacciSeries{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter a number");
            int n=sc.nextInt();
            int a=0,b=1;
            System.out.print(a+ " " +b);
            for(int i=2;i<n;i++){
                int c=a+b;
                System.out.println(" "+c);
                a=b;
                b=c;
                
            }
        }
    }
}