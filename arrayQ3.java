import java.util.Arrays;
import java.util.Scanner;
//program to find second largest number in the array
public class arrayQ3
{
    static int find(int arr[]){
        int largest=arr[0];
        int sec=arr[0];
        int l=0,s;
        for (int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
                l=i;
            }
        }
        arr[l]=Integer.MIN_VALUE;

        System.out.println("Elements are = ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            if(sec<arr[i]){
                sec=arr[i];

            }
        }
         return sec;

    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("second largest number in the array = "+find(arr));
    }
}
