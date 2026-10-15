package Day03;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        
        
TreeMap<Integer, String> students = new TreeMap<>();

students.put(103, "Amit");
students.put(101, "Priya");
students.put(102, "Rahul");

System.out.println(students);

System.out.println(students.firstKey()); 
System.out.println(students.lastKey()); 
System.out.println(students.get(102)); 
    }
}
