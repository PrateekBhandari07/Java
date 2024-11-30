import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class string
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
      //  String s1=sc.nextInt();
        String nw="";
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if (ch== ' ') {
                continue;
            } else {
                nw+=ch;
            }
        }
        System.out.println(nw);
    }
}
