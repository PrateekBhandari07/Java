package physics_wallah;

//PIN= ((MAX digit of input1 x MIN digit of input1) x (MAX digit of input2 x MIN digit of input2) x (MAX digit of input3 x MIN digit of input3)) - input4 Example - If input1 = 3521, input2-2452, input3-1352, and input4=38,
//
//then PIN = ((5 x 1) x (5 x 2) x (5x 1)) -38 = (5 x 10 x 5) - 38 = 212

import java.util.Scanner;

public class Find_PIN
{
    public static int findMax(int n){
        int max=0;
        while(n>0){
            int num=n%10;
            if(num>max){
                max=num;
            }
            n/=10;

        }

        return max;
    }
    public static int findMin(int n){
        int min=9;
        while(n>0){
            int num=n%10;
            if(num<min){
                min=num;
            }
            n/=10;

        }

        return min;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter four numbers : ");
        int input1=sc.nextInt();
        int input2=sc.nextInt(),input3=sc.nextInt(),input4=sc.nextInt();
        int max1=findMax(input1);
        int max2=findMax(input2);
        int max3=findMax(input3);
        int min1=findMin(input1);
        int min2=findMin(input2);
        int min3=findMin(input3);
        int pin=((max1*min1)*(max2*min2)*(max3*min3)-input4);
        System.out.println(pin);
    }
}
