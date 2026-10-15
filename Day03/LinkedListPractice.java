package Day03;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
         LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(10);
    linkedList.add(20);
    linkedList.add(30);
    System.out.println(linkedList);
    System.out.println(linkedList.isEmpty());

for(int num : linkedList) {
    System.out.println(num);
}

linkedList.addFirst(10);
linkedList.addLast(40);
    System.out.println(linkedList);
    }
}
