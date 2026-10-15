package Day03;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mapList = new HashMap<>();


        mapList.put(0,1);
        mapList.put(1,3);
        mapList.put(2, 4);
        mapList.put(3, 5);
    System.out.println(mapList);


    System.out.println(mapList.get(1));

    System.out.println(mapList.getOrDefault(3,0));

    System.out.println(mapList.containsKey(1));
    System.out.println(mapList.entrySet());

    int[] arr = {1, 2, 2, 3, 3, 3};

    HashMap<Integer, Integer> freq = new HashMap<>();

    for(int num: arr) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
    System.out.println(freq);
    
    }
}
