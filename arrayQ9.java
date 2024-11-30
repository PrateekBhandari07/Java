import java.util.*;
//program to sort an array consisting of 0 and 1.
public class arrayQ9
{
    static void printarray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void zand1(int arr[]){
        int n=arr.length;
        int zero=0;
//        counting the occurances of zero
        for(int i=0;i<n;i++) {
            if (arr[i] == 0) {
                zero += 1;

            }
        }
        System.out.println(zero);
//            printing array from o to zero-1 and zero to n
            for (int j=0;j<n;j++){
                if (j<zero){
                    arr[j]=0;
                }
                else {
                    arr[j]=1;
                }
            }

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
//        Arrays.sort(arr);
        System.out.println("Elements are = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        zand1(arr);
        System.out.println("The sorted array : " );
        printarray(arr);
    }
}
