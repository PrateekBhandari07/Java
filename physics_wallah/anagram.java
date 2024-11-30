package physics_wallah;

import java.util.Scanner;

public class anagram
{
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int num=0;
        while (n!=0){
            int i=n%10;
            num=num+(i*i*i*i);
            n=n/10;
        }
        if(num==temp){
            System.out.println(num+" Anagram");
        }
        else {
            System.out.println("no");
        }
    }
}
