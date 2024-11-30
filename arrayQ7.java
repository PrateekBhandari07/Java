import java.util.Arrays;
import java.util.Scanner;

public class arrayQ7
{
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
         Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println();
        Arrays.sort(arr);
        System.out.println("sorted array = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
