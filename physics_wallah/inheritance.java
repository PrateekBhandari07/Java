package physics_wallah;

import java.util.Scanner;

class base{
        base(){
            System.out.println("construct");
        }
       void a(){
           System.out.println("Mehod");
       }
}
public class inheritance
{
    public static void main(String[] args) {
//        base a=new base();
//        a.a();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
//        ,b=sc.nextInt(),c=sc.nextInt();
//        System.out.println((a>b)?((a>c)?a:c):(b>c)?b:c);
        char p='A';
        int t=a;
//        for (int i=0;i<a;i++){
//            for(int j=0;j<a;j++){
//                    if(j==0||j==(a-1)||i==j&&j<=(a-1)/2||i+j==(a-1)&&j>(a-1)/2) {
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("  ");
//                    }
//
//            }
//            System.out.println();
//        }

        for (int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i==0||i==(a-1)||j==0||j==a-1||i+j==(a-1)/2||i-j==(a-1)/2||j-i==(a-1)/2||i+j==a-1+(a-1)/2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i==0||i==(a-1)||j==0||j==a-1||i+j<=(a-1)/2||i-j>=(a-1)/2||j-i>=(a-1)/2||i+j>=a-1+(a-1)/2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
