package physics_wallah;

import java.util.Scanner;

public class prime2
{
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("prime number");
            System.exit(1);

        }
        for (int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not a prime number");
                break;
            }
            if(i+1==n){
                System.out.println("prime number");
            }
        }

    }
}
