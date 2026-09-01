import java.util.Scanner;
public class sumofevenelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element ");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(" " + sum);
        sc.close();
    }
}
