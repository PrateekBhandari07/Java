package physics_wallah;
//how many minimum digits in the array to be changed so that all digits in the array should be same
import java.util.Scanner;

public class fEqualArray
{
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int count=0;
            int more =0,high=0,num=0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++){
                more=0;
                for(int j=i;j<n;j++){
                    if (arr[i]==arr[j]){
                        more++;
                    }
                }
//                System.out.println(more);
                if(high<more){
                    high=more;
                    num=arr[i];
                }
            }

//            System.out.println(num);
            for(int i=0;i<n;i++){
                if(num!=arr[i]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
      
    }

