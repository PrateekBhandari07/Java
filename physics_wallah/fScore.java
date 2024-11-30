package physics_wallah;
//You are participating in a contest which has 11 problems (numbered 1 through 11).
//The first eight problems (i.e. problems 1,2,…,8) are scorable, while the last three problems (9,10,11) are
// non-scorable ― this means that any submissions you make on any of these problems do not affect your total score.

//Your total score is the sum of your best scores for all scorable problems. That is, for each scorable problem,
// you look at the scores of all submissions you made on that problem and take the maximum of these scores
//(or 0 if you didn't make any submissions on that problem); the total score is the sum of the maximum scores you took.


import java.util.Scanner;

public class fScore
{
    public static void main(String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();

            int arr[]=new int[12];
            for( int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(arr[a]<b){
                    arr[a]=b;
                }
            }
            int sum=0;
            for(int i=0;i<9;i++){
                sum+=arr[i];
            }
            System.out.println(sum);

        }
    }
}
