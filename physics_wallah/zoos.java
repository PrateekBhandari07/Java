package physics_wallah;
//You are required to enter a word that consists of and
//that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 2*x=y
//Determine if the entered word is similar to word zoo.
//For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.
import java.util.Scanner;

public class zoos
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int countz=0,counto=0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == 'z') {
                countz = countz + 1;
            } else {
                counto++;
            }
        }
        if((2*countz)==counto){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
