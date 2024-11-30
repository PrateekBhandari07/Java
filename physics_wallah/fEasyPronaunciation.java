package physics_wallah;

import java.util.Scanner;
//Words that contain many consecutive consonants, like "schtschurowskia", are generally considered somewhat hard to pronounce.
//We say that a word is hard to pronounce if it contains
//4 or more consonants in a row; otherwise it is easy to pronounce. For example, "apple" and "polish" are easy to pronounce, but "schtschurowskia" is hard to pronounce.
//You are given a string S consisting of
//N lowercase Latin characters. Determine whether it is easy to pronounce or not based on the rule above — print YES if it is easy to pronounce and NO otherwise.
public class fEasyPronaunciation
{
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();

            int c=0;
            for(int i=0;i<n;i++){
                if(c==4){
//                    System.out.println("NO");
                    break;

                }
                else if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    c=0;
                }
                else{
                    c++;
                }
//                if(i==n-1){
//                    System.out.println("YES");
//                }
            }
            if(c==4) System.out.println("NO");
            else System.out.println("YES");


        }
    }
}
