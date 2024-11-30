import java.util.Scanner;

public class arrayQ6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("swapped values of a and b "+a+" "+b);

    }
}
