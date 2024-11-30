import java.util.Scanner;
//A, B, and, C are standing on the coordinate plane. C is standing at the origin
//(coordinates(0,0) while the location of a and b are(x1,y1) and (x2,y2) respectively.
//Amongst a and b find out who is at a farther distance from chef or determine if both are at the
//same distance from chef.
public class f_coordinates
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int a=Math.abs(sc.nextInt());
            int b=Math.abs(sc.nextInt());
            int c=Math.abs(sc.nextInt());
            int d=Math.abs(sc.nextInt());
            if(a+b==c+d){
                System.out.println("EQUAL");
            }
            else if(a+b>c+d){
                System.out.println("ALEX");
            }
            else{
                System.out.println("BOB");
            }
        }


    }
}
