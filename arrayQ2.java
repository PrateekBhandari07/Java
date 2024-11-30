import java.util.Scanner;
//proogram to find a positive unique number in the given array
public class arrayQ2
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
        System.out.println("Elements are = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                   arr[i]=Integer.MIN_VALUE;
                   arr[j]=Integer.MIN_VALUE;
                }
                }
            }
        System.out.println();
        for(int i=0;i<n;i++) {
            if (arr[i]>Integer.MIN_VALUE){
                System.out.println(arr[i]+"is repeated only once in the array");
            }
            }
        }

}