import java.util.Scanner;

public class sumof_n_numbers_for
{
    public static void main(String[] args) {
        System.out.println("enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
//        //int sum=0;
//        for(int i=0;i<=num;i++){
//        //    sum+=i;
//        }
//        //System.out.println(sum);
        System.out.println("numbers in reverse order");
        for(int i=num ;i>0;i--){
            System.out.println(i);
        }
    }
}
