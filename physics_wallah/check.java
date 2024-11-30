package physics_wallah;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int arr1[]=new int[a];
            int arr2[]=new int[b];
            StringBuilder ss=new StringBuilder();
            for(int i=0;i<a;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<a;i++){
                if(b>=arr1[i]){
                    arr2[i]=1;
                    b-=arr1[i];
                }
                else{
                    arr2[i]=0;
                }

            }
            for(int i=0;i<a;i++){
                System.out.print(arr2[i]);
            }
            System.out.println();
        }
    }
}
