import java.util.Scanner;
// given a array in non-decreasing order,return array of the squares of each number
//in non-decreasing order.
public class arrayQ12
{
    static  void printarray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void square(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i]=arr[i]*arr[i];
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n], arr2[]=new int [n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are = ");
        printarray(arr);
        System.out.println();
        square(arr);
        System.out.print(" Array of squares :");
        printarray(arr);
    }
}
//This is not applicable for -ve series such as -10,-2,1,2,5
//refer array13