package physics_wallah;

import java.util.Scanner;

public class secondHighest
{

    public  static int second(int arr[]){
        int highest=Integer.MIN_VALUE;
        int n=arr.length;
        int pos=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>highest){
                highest=arr[i];
                pos=i;
            }
        }
        return pos;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The second highest element in the array is = ");
        int hig=second(arr);
        arr[hig]=Integer.MIN_VALUE;
//        int highest=Integer.MIN_VALUE;

//        for(int i=0;i<n;i++){
//            if(arr[i]>highest){
//                highest=arr[i];
//            }
//        }
        int secondhighest=second(arr);
        System.out.println(arr[secondhighest]);
    }
}
