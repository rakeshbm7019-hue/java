import java.util.Scanner;

public class OddIndex{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Odd Elements:");
    for(int i=0;i<arr.length;i++){
        if(i%2!=0){
        System.out.print(arr[i]+" ");
    }
}
    sc.close();
}
}
