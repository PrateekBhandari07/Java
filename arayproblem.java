import java.util.Scanner;

public class arayproblem  {
    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        System.out.println("Enter "+s+" Elements = ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter searching element=");
        s=sc.nextInt();
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==s){
              c++;
            }
        }
        System.out.println(s+" repeated "+c+" time in the array");
    }
}
