package physics_wallah;

import java.util.Scanner;
//CodeChef offers a feature called streak count. A streak is maintained if you solve at least one problem daily.
//Om and Addy actively maintain their streaks on CodeChef. Over a span of
//N consecutive days, you have observed the count of problems solved by each of them.
//Your task is to determine the maximum streak achieved by Om and Addy and find who had the longer maximum streak.
public class fstreak
{
    static int check(int a){
        Scanner sc=new Scanner(System.in);
        int count=0,result=0;
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                if(result<count)
                {
                    result=count;
                }
                count=0;
            }
            else count++;
        }
        return result;


}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s1=check(n);
            int s2=check(n);
            if(s1==s2) System.out.println("draw");
            else if(s1>s2) System.out.println("om");
            else System.out.println("addy");


        }
    }
}
