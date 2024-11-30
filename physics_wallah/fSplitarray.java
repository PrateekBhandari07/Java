package physics_wallah;
import java.util.*;
//split a array into two parts such that no two numbers in a array should repeat.
public class fSplitarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int l=n*2;
//            System.out.println(l);
            int arr[]=new int[l];
            for (int i=0;i<l;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<l-2;i++){
                if(arr[i]==arr[i+1]&&arr[i]==arr[i+2]){
                    System.out.println("no");
                    break;
                }
                if(i==l-3) System.out.println("yes");
            }
        }
    }
}
