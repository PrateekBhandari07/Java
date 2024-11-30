import java.util.Scanner;
//program to reverse a array and store it in new array
public class arrayQ8
{
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n],arr2[]=new int [n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int j=0;

        for(int i=n-1;i>=0;i--){
           arr2[j++]=arr[i];
        }
        System.out.println("Array in reverse order");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
