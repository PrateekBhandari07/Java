import java.util.Scanner;

public class arrayQ13
{
    static  void printarray(int arr[]){
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
  static void reverse(int arr[]){
        int i=0,j=arr.length-1;
        while (i<=j){
            if(arr[i]>arr[j]){
                swap(arr,i,j);
                i++;
            }
            else {
                   j--;
            }
        }
  }
    static void check(int arr[],int arr2[]) {
        int n = arr.length, left = 0, right = n - 1, j = 0;
        while (left <= right) {
            if (Math.abs(arr[left])>Math.abs(arr[right])) {
                arr2[j++]=arr[left]*arr[left];
                left++;
            }
            else {
                arr2[j++]=arr[right]*arr[right];
                right--;
            }
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
        check(arr,arr2);
        printarray(arr2);
        System.out.println("sorted array : ");
        reverse(arr2);
        printarray(arr2);
    }
}
