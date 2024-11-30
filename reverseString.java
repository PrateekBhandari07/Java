import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        System.out.print("Enter a String = ");

        //to reverse the string
        Scanner sc=new Scanner(System.in);
        String ns="",s=sc.nextLine();
        System.out.println("enter the second string = ");
        String ss= sc.nextLine();

       // System.out.println(s);
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            ns=ch+ns;
        }
        System.out.println("Reversed string = "+ns);
//to check the length of the string
        System.out.println(s.length());

        int c=0;
//to count the total number of character in the string
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                continue;
            }
            else{
                c++;
            }
        }

        System.out.println("total number of characteres except White space= "+c);



int co=0,vo=0;

        //to count the total number of vowel and consonents in the string
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                continue;
            }
            else if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                vo++;

            }
            else{
                co++;
            }
        }
        System.out.println("vovel="+vo);
        System.out.println("consonent="+co);
        int ct=0;
        //to check both the string are same or not
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==ss.charAt(i)){
//                ct++;
//            }
//            else{
//                System.out.println("both string are of different length");
//                break;
//            }
//        }
//        if(ct==s.length()){
//            System.out.println("Both are same string");
//        }
//        else{
//            System.out.println("both string are of different length");
//
//        }


        if(s.length()!=ss.length()){
            System.out.println("not possible ");
        }
        else {
            s = s.toLowerCase();
            ss = ss.toLowerCase();
            System.out.println(s + ss);

            char s1[] = s.toCharArray();
            char s2[] = ss.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
            System.out.println(s1);
            System.out.println(s2);
            if(Arrays.equals(s1,s2) == true){
                System.out.println("anagram");
            }
            else {
                System.out.println("not");
            }

        }
    }
}
