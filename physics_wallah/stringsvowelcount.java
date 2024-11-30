package physics_wallah;

public class stringsvowelcount
{
    public static void main(String[] args) {
        String s="Hello Guys",str="";
        int count=0;
        String lower=s.toLowerCase();
        System.out.println(lower);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                str+=s.charAt(i);
                count++;
            }
        }
        System.out.println(count +" numbers repeated in the string they are "+str);
    }
}
