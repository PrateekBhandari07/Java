


//Find the total number of pairs in the array whose sum is equal to the given value of target element

import java.util.Scanner;

public class arrayQ1
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
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k]== 12) {
                        result += 1;
                        System.out.println(arr[i] + " " + arr[j]+" "+arr[k]);
                    }
                }
            }
        }
        System.out.println("final ans = "+result);
    }
}
