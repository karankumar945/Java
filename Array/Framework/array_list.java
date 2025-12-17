
import java.util.ArrayList;
import java.util.Collections;

public class array_list{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        // add
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        // get
        System.out.println(list.get(1));
        // modify
        // add
        list.add(1, 2);
        System.out.println(list);
        // set
        list.set(0, 10);
        System.out.println(list);
        // delete
        list.remove(3);
        System.out.println(list);
        // size
        System.out.println(list.size());
        // sort
        Collections.sort(list);
        System.out.println(list);
    }
}