import java.util.Scanner;
//sort a array such that even number should come first than the odd number
//simple approach
public class arrayQ10
{
    static void printarray(int arr2[]){
        int n=arr2.length;
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    static void sort(int arr[],int arr2[]){
        int n=arr.length;

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr2[j]=arr[i];
                j+=1;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                arr2[j]=arr[i];
                j+=1;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort(arr,arr2);
        System.out.println("sorted array = ");
        printarray(arr2);

    }
}
