package physics_wallah;

import java.util.Scanner;

public class fPhotoFrame
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int n=sc.nextInt();
        String message="";
      for(int i=0;i<n;i++){
           int w=sc.nextInt(),h=sc.nextInt();
           if(w<l||h<l) message+="UPLOAD ANOTHER" +"\n";
           else if (w==l&&h==l) message+="ACCEPTED"+"\n";
           else message+="CROP IT"+"\n";

        }
        System.out.println(message);
        System.out.println(Math.abs(5-9));
    }
}
