import java.util.ArrayList;
import java.util.Collections;
public class arraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(); //defining arraylist
        ArrayList<String> list1 =new ArrayList<>();
        ArrayList<Float> list2 =new ArrayList<>();
        ArrayList<Boolean> list3 =new ArrayList<>();
        //add elements
        list.add(0);
        list.add(9);
        list.add(5);
        list.add(8);
        list1.add("King");
        list1.add("is");
        list1.add("Singh");
        list2.add(4.9f);
        list3.add(true);
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        //set elements
        int element=list.get(0);
        System.out.println(element);
        //change element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loops
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}