package Day03;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListPractice {
    public static void main(String[] args) {
        
    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(21);
    list.add(34);
    list.add(1,55);

    System.out.println(list);
    System.out.println(list.get(2));

    list.set(0,11);
    list.remove(Integer.valueOf(21));
    System.out.println(list.contains(11));
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.indexOf(11));

    for(int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }

   

    }
}
