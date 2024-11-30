package physics_wallah;

import java.util.Scanner;

public class Trainproblem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int start=sc.nextInt();
        int finist=sc.nextInt();
        int ticket_cost[]=new int[N];
        int count=0,count2=0;
        System.out.println("Enter rate : ");
        for(int i=0;i<ticket_cost.length;i++){
            ticket_cost[i]=sc.nextInt();
            if(i>=start-1 && i<=finist-2){
                count+=ticket_cost[i];
            }else {
                count2 += ticket_cost[i];
            }
        }
        int min = (count < count2) ? count : count2;
        System.out.println(min);

    }
}
