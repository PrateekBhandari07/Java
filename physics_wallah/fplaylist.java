package physics_wallah;
//Bob has a playlist of N songs,
// each song has a singer associated with it (denoted by an integer)
//        Favourite singer of Bob is the one whose songs are the most on the playlist
//        Count the number of Favourite Singers of Bob
import java.util.Scanner;

public class fplaylist {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many songs : ");
        int N=sc.nextInt();
        int a[]=new int[N];
        System.out.println("mention singer Number for each song : ");
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        int count=0,max=0,c=0;
        for(int i=0;i<N;i++){
            count=0;
            for(int j=i;j<N;j++){
                if(a[i]==a[j]){
                    count=count+1;
                }
            }
            if (count==max){
                c=c+1;
            }
            else if (count>max){
                max=count;
                c=1;
            }

        }
        System.out.println("total number of favourite singers : "+c);

    }
}
