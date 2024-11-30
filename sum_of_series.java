import java.util.Scanner;

public class sum_of_series
{
    public static void main(String[] args) {
        System.out.println("Enter nth number of the series = ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(),sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
