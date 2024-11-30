import java.util.Scanner;
//Program to check if an array can be partitioned into sub-arrays with equal sum

public class arrayQ14
{
    static  void printarray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void prefixsum(int arr[],int arrp[]){
        int n=arr.length;
        arrp[0]=arr[0];
        for(int i=1;i<n;i++){
            arrp[i]=arr[i]+arrp[i-1];
        }
    }static void sufixsum(int arr[],int arrs[]){
        int n=arr.length;
        arrs[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arrs[i]=arr[i]+arrs[i+1];
        }
    }
    static void check(int arrp[],int arrs[]){
        int n=arrp.length;
        for(int i=0;i<n-1;i++){
            if(arrp[i]==arrs[i+1]){
                System.out.println(arrp[i]+" "+arrs[i+1]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n], arrp[]=new int [n], arrs[]=new int [n];
        System.out.println("Enter the elements in the array ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are = ");
        printarray(arr);
        System.out.println();
        prefixsum(arr,arrp);
        sufixsum(arr,arrs);
        check(arrp,arrs);


    }
}
