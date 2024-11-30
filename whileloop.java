import java.util.Scanner;

public class whileloop
{
    public static void main(String[] args) {
        System.out.println("enter a number = ");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(a+" x "+i+" = "+(a*i));
            //i+=1;
            i++;
        }
    }
}
