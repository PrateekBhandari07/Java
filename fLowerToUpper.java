import java.util.Scanner;

public class fLowerToUpper
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String n="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){

                n+=Character.toString(Character.toLowerCase(s.charAt(i)));

            }
            else {
                n+=Character.toString(Character.toUpperCase(s.charAt(i)));

            }

        }
        System.out.println(n);

    }
}
