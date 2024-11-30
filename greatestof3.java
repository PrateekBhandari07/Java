import java.util.*;
//import java.lang.*;

public class greatestof3
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many numbers = ");
        int t=sc.nextInt();
        int a []=new int[t];
        System.out.println("Enter "+t+" numbers = ");
        for(int i=0;i<t;i++)
        {
         a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Largest among these "+a[t-1]);
          }
}
