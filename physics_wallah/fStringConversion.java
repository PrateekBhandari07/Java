package physics_wallah;
import java.util.Scanner;
//For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:
//
//        00 is replaced with A
//        01 is replaced with T
//        10 is replaced with C
//        11 is replaced with G
public class fStringConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            String st=sc.next();
            String s="";
            for(int i=0;i<n;i+=2){
                if(st.charAt(i)=='0' && st.charAt(i+1)=='0') {
                    s = s + 'A';

                }
                else if (st.charAt(i)=='1' && st.charAt(i+1)=='1') {
                    s+='G';
                }
                else if (st.charAt(i)=='0' && st.charAt(i+1)=='1') {
                    s+='T';
                }
                else if (st.charAt(i)=='1' && st.charAt(i+1)=='0') {
                    s += 'C';
                }
            }
            System.out.println(s);
        }
    }
}
