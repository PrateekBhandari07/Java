package physics_wallah;

import java.util.Scanner;
//You have been given a String S consisting of uppercase and lowercase English alphabets.
// You need to change the case of each alphabet in this String.
// That is, all the uppercase letters should be converted to
// lowercase and all the lowercase letters should be converted to uppercase.
// You need to then print the resultant String to output.
public class fPalindromeString
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String n="";
        for(int i=s.length()-1;i>=0;i--){
            n=n+(s.charAt(i));
        }
        System.out.println(n);
        if(s.equals(n)) System.out.println("Yes");
        else System.out.println("No");
    }
}
