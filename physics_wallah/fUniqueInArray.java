package physics_wallah;
//find how many unique number are there in the array
import java.util.Arrays;
import java.util.Scanner;

public class fUniqueInArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int c=0;
            int n= sc.nextInt();
            int arr[]=new int [n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<n-1;i++){
                    if(arr[i]!=arr[i+1]){
                        c++;
                    }


            }

            System.out.println(c+1);



    }
}
