import java.util.Scanner;
//sort a array such that even number should come first than the odd number
//using two pointer approach
public class arrayQ11
{
    static  void printarray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortbyparity(int arr[]){
        int n=arr.length;
        int left=0,right=n-1;
        while (left<right){
            if(arr[left] % 2==1 && arr[right] % 2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            else if (arr[left] % 2==0){
                left++;
            }else if (arr[right] % 2==1){
                right--;
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
        System.out.println("Elements are = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sortbyparity(arr);
        System.out.println("sorted array = ");
        printarray(arr);
    }
}
