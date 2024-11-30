import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class arrayy
{
    static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {

        System.out.println("how many elements : ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        System.out.println("Enter "+s+" Elements = ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("printing elements");
         printarr(a);
         int ap[]= Arrays.copyOf(a,2);
         printarr(ap);
        System.out.println("sorting arrays in ascending order : ");
        Arrays.sort(a);
        printarr(a);
        System.out.println("sorting arrays in decending order : ");
//        Arrays.sort(a, Collections.reverseOrder());



    }
}
