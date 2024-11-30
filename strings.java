import java.util.*;
import java.lang.*;
public class strings
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        int a[][]=new int[4][1];
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                a[i][j]=sc.nextInt();
//            }
//        }
//        for(int f[]:a){
//            for (int y:f){
//                System.out.println(y);
//            }
//        }

//        for(int i=0;i<4;i++){
//            for(int j=0;j<2;j++){
//                System.out.println( "element at position "+i+","+ j+" = " +a[i][j]);
//            }}
//        System.out.println(a[1][1]);
//
//        System.out.println("\n\t Length = "+a.length);


//
//        int z[]=new int[4];
//        for(int i=0;i<4;i++){
//            z[i]=sc.nextInt();
//        }
//        for(int all:z){
//            System.out.println(all);
//        }

        int g[]={1,2,3,4,3},sum=0;
        for(int i=0;i<g.length;i++){
           // System.out.println(i);
            sum+=g[i];

        }
        System.out.println(sum);
       int great=0,temp=0;
       for(int i=0;i<g.length;i++){
           if(g[i]>great){
               great=g[i];
           }
       }
        System.out.println("great = "+great);
        System.out.println("Enter the searching element = ");
        int s =sc.nextInt();
        int ans=-1;
        for(int i=0;i<g.length;i++){
            if(g[i]==s){
                //System.out.println("searching element is found  @ "+(i+1)+"postion");
                ans=i;
            }


        }
        if(ans==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("searching element is found  @ "+(ans+1)+" postion");
        }
    }
}
