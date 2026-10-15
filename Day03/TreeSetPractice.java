package Day03;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetPractice {
        public static void main(String[] args) {
        
TreeSet<Integer> set = new TreeSet<>();

set.add(50);
set.add(10);
set.add(40);
set.add(20);
set.add(30);

System.out.println(set);

TreeSet<Integer> set1 =
    new TreeSet<>(Arrays.asList(30, 10, 20));
    }
}
