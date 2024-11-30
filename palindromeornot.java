import java.util.Scanner;

public class palindromeornot
{
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),reverse="";
        for(int i=s.length();i>0;i--){
            reverse+=s.charAt(i-1);
        }
        System.out.println("reversed string is ="+reverse);
        if (s.equals(reverse)){
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }

    }
}
