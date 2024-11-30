import java.util.Arrays;
import java.util.Scanner;

public class array1
{
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        arr[1]=11;
        arr[2]=12;
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
        int arr2[]=arr.clone();
        int arr3[]=Arrays.copyOf(arr,3);
        System.out.println(arr[2]);
    }
}
