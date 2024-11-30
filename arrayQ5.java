import java.util.Scanner;
//to find last repeated pair in the array
public class arrayQ5
{
    static int repeat(int arr[])
    {
        int n=arr.length;
        for (int i=n-1;i>=0;i++){
            for(int j=i-1;j>0;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1 ;
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
        System.out.println(repeat(arr)+" is last element that has repeated in the array");

    }
}
