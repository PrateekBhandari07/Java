import java.util.Scanner;
//sum of series(1-2+3-4+5-6.....n)
public class sum_of_series_2 {
    public static void main(String[] args) {
        System.out.println("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sum-=i;
            }
            else {
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
