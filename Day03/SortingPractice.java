package Day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingPractice {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7 };

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));

        Collections.sort(numbers);

        System.out.println(numbers);

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Swayam", "Amit", "Rahul", "Raj"));

        names.sort(Comparator.comparingInt(String::length));

        System.out.println(names);

        // Dynamic indexed list ArrayList
        // Operations at both ends ArrayDeque
        // Key-value lookup / frequency HashMap
        // Unique elements HashSet
        // Sorted keys TreeMap
        // Sorted unique elements TreeSet
        // Repeatedly retrieve smallest/largest PriorityQueue
        // Sort an array Arrays.sort()
        // Sort a list Collections.sort() or list.sort()
        // Custom ordering Comparator
        // Natural ordering for your own class Comparable
    }
}
