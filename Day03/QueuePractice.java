package Day03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println(pq);
        pq.poll();
        pq.peek();
        System.out.println(pq);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(20);
        deque.addLast(30);

        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(10);
        queue.offerLast(20);
        queue.offerLast(30);

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
