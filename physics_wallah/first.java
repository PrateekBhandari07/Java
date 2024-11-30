package physics_wallah;

import java.util.Locale;
import java.util.Scanner;

class Prateek{

    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}
public class first
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        StringBuffer a=new StringBuffer("prateek");
//        StringBuffer b=new StringBuffer("prateek");
        String a="pratee  k";
        String b=new String("prAteek");
//        StringBuilder a=new StringBuilder();
//        StringBuilder b=new StringBuilder();
//        a.append("Prateek");
//        b.append("Prateek");
        System.out.println(a+" "+b);
//        System.out.println(a.capacity());
//        System.out.println(b.capacity());
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a.length());
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println();
        if(a.equalsIgnoreCase(b)){
            System.out.println("dfgs");
        }
        System.out.println( a.trim().length());








    }
}
