package physics_wallah;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1
{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            arr.add(x);
        }
        System.out.println(arr);

    }
}
