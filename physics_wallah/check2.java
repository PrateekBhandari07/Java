package physics_wallah;
import java.util.Arrays;
import java.util.Scanner;
public class check2
{
    public static void main(String[] args) {
        // your code goes here
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int min=0;
            int n=sc.nextInt();
            if(n==1) {
                System.out.println(0);
                break;
            }

            else{
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();

                }
                Arrays.sort(arr);
                for(int i=0;i<n;i++){
                    if(arr[i]!=arr[0]){
                        min++;
                    }

                }

                System.out.println(min);

            }
        }
    }
}
