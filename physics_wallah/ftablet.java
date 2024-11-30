package physics_wallah;

import java.util.Scanner;
//chef want to buy a tablet of rupees total .and he wanted to buy a tablet so
//that resulted a maximum are of tablet.
public class ftablet
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of iteration : ");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("total store chef visted : ");
            int n=sc.nextInt();
            System.out.println("Enter cost : ");
            int total=sc.nextInt();
            int cost=0,dim=0;
            for(int i=0;i<n;i++){
                System.out.println("Enter width of the" + i+" tablet");
                int w=sc.nextInt();
                System.out.println("Enter height of the" + i+"  tablet : ");
                int h=sc.nextInt();
                System.out.println("Enter price of the" + i+"  tablet");
                int p=sc.nextInt();
                int area=w*h;
                if(p>total) continue;
                else{
                    if(area>dim){
                        dim=area;
                        cost=p;
                    }

                }
            }
            System.out.println("highest area of tablet which he can buy ");
            if(cost==0) System.out.println("no tablet");
            else System.out.println(dim);
        }
    }
}
