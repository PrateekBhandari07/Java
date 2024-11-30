import java.util.Scanner;

public class A_power_B
{
    public static void main(String[] args) {
        System.out.println("Enter value for A = ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
       int c=a,pow=1;
        System.out.println("Enter value for B = ");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            pow=pow*a;
        }
    System.out.println(c+" to the power "+b+" is = "+pow);
    }
}
