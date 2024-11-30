import java.util.Scanner;
//A has fallen in love with B, and wants to buy
//        N gifts for her. On reaching the gift shop, Chef got to know the following two things:
//        The cost of each gift is 1 ,1 coin.
//        On the purchase of every 4th gift, Chef gets the  5 th gift free of cost.
//        What is the minimum number of coins that Chef will require in order to come out of the shop carrying
//        N gifts?
public class fGifts
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total number of iteration : ");
        int t=sc.nextInt(),result=0;

        while(t>0){
            t--;
            System.out.println("enter total number of gifts A purchased for B : ");
            int n=sc.nextInt(),count=0;
            count=n/5;
            System.out.println("total coins a should pay to shop : ");
            System.out.println(n-count);
        }

    }
}
