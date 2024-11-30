package physics_wallah;

public class reverseString
{
    public static void main(String[] args) {
        String s="keetarP";
        int len=s.length();
        for (int i=len;i>0;i--){
            System.out.print(s.charAt(i-1));
        }
    }
}
