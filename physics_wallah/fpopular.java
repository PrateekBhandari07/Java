package physics_wallah;

import java.util.Scanner;

//A post on facebook is said to be more popular if the number of likes on the post is strictly greater than the number of likes on some other post.
// In case the number of likes is same, the post having more comments is more popular.
//Given arrays A and B, each having size N, such that the number of likes and comments on the ith
//  post are A i and B i respectively, find out which post is most popular.
//It is guaranteed that the number of comments on all the posts is distinct.
public class fpopular
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Numberof test cases : ");
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n],arr2[]=new int[n];
            System.out.println("Enter likes ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter comments : ");
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            int maxlike=0,maxcomment=0;
            int index=0;
            for(int i=0;i<n;i++){
                if(arr[i]>maxlike||(arr[i]==maxlike&&arr2[i]>maxcomment)){
                    maxlike=arr[i];
                    maxcomment=arr2[i];
                    index=i;
                }
            }

            System.out.println(index+1);
            System.out.println("index element is more popular");
        }

    }
}
