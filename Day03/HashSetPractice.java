package Day03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class HashSetPractice {
    public static void main(String[] args) {

        // 1. HashSet basics
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(12);
        set.add(15);
        set.add(18);
        set.add(18); // Duplicate ignored

        System.out.println("HashSet: " + set);

        // 2. contains()
        System.out.println(set.contains(12)); // true
        System.out.println(set.contains(99)); // false

        // 3. remove()
        set.remove(15);
        System.out.println("After remove: " + set);

        // 4. size()
        System.out.println("Size: " + set.size());

        // 5. isEmpty()
        System.out.println("Empty? " + set.isEmpty());

        // 6. Add all distinct array elements
        int[] arr = {1, 2, 2, 3, 3, 3};

        HashSet<Integer> set1 = new HashSet<>();

        for (int num : arr) {
            set1.add(num);
        }

        System.out.println("Distinct: " + set1);
        System.out.println("Distinct count: " + set1.size());

        // 7. addAll() - union of two sets
        HashSet<Integer> a = new HashSet<>(
            Arrays.asList(1, 2, 3)
        );

        HashSet<Integer> b = new HashSet<>(
            Arrays.asList(3, 4, 5)
        );

        a.addAll(b);
        System.out.println("Union: " + a);

        // 8. retainAll() - intersection
        HashSet<Integer> x = new HashSet<>(
            Arrays.asList(1, 2, 3)
        );

        HashSet<Integer> y = new HashSet<>(
            Arrays.asList(2, 3, 4)
        );

        x.retainAll(y);
        System.out.println("Intersection: " + x);

        // 9. removeAll() - remove common elements
        HashSet<Integer> p = new HashSet<>(
            Arrays.asList(1, 2, 3, 4)
        );

        HashSet<Integer> q = new HashSet<>(
            Arrays.asList(2, 4)
        );

        p.removeAll(q);
        System.out.println("Difference: " + p);

        // 10. LinkedHashSet - insertion order
        LinkedHashSet<Integer> linkedHashSet =
            new LinkedHashSet<>();

        linkedHashSet.add(21);
        linkedHashSet.add(11);
        linkedHashSet.add(5);
        linkedHashSet.add(3);

        System.out.println("Insertion order: " + linkedHashSet);

        //11. Duplicate number check
        int[] arr1 = {1, 2, 3, 2, 4, 1};

HashSet<Integer> seen = new HashSet<>();

for (int n : arr1) {
    if (seen.contains(n)) {
        System.out.println("Duplicate: " + n);
    } else {
        seen.add(n);
    }
}
int[] nums = {100, 4, 200, 1, 3, 2};

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }


        System.out.println(longest);

    }
}