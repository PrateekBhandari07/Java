import java.util.Scanner;
import java.math.*;
public class factorial_for {
    public static void main(String[] args) {
        System.out.println("enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of entered number = "+fact);
    }
}
