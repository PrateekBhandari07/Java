import java.util.Scanner;

public class sumof_n_numbers_while {
    public static void main(String[] args) {
        System.out.println("enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,i=0;

        while (i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
