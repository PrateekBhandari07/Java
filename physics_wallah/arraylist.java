package physics_wallah;

import java.util.ArrayList;

public class arraylist
{
    public static void main(String[] args) {
//        Integer j=Integer.valueOf(4);
//        System.out.println(j);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(2);
        System.out.println("Printing list without loop : "+list);
//        list.add(1);
        System.out.println("getting element present at postion 0 (INDEXING):"+list.get(0));  //8
        System.out.println("Printing list using for loop : ");
        for(int i=0;i<list.size();i++){
            System.out.print (list.get(i) +" "); //prints list
        }
        System.out.println();

//        adding 100 at position 0
        list.add(0,100);
        System.out.println("Adding 100 at postion 0 "+list);

//        changing the values of the element which is present in 1nd index to 1
        list.set(1,1);
        System.out.println("Changing element which is present at postition 1 "+list);

        System.out.println("");
//       removing element which is present at index i
        list.remove(0);
        System.out.println("removing element which is present at index 0 : "+list);

//        removing element e
        list.remove(Integer.valueOf(1));
        System.out.println("List after removing element 1 :"+list);

        System.out.println();
//        checking a element exist or not
        boolean ans=list.contains(Integer.valueOf(5));
        System.out.println(ans);
        System.out.println();
//        If we do not specify any wrapper class ,we can put anything inside l
        ArrayList l=new ArrayList();
        l.add(1);
        l.add("sdh");
        System.out.println(l);
    }
}
