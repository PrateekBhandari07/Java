import java.util.Scanner;

public class sum_Of_number
{
    public static void main(String[] args) {
        System.out.println("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int d=0;
        while(num>0){
            d+=num%10;
            num=num/10;
         }
        System.out.println(d);
    }
}
