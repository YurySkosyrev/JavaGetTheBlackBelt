package com.javacourse.collection.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addFirst(3);
        System.out.println(deque);
        deque.offerFirst(5);
        System.out.println(deque);
        deque.addLast(9);
        deque.offerLast(6);
        System.out.println(deque);
        System.out.println("GetFirst: " + deque.getFirst());
        System.out.println("PeekFirst: " + deque.peekFirst());
        System.out.println("GetLast: " + deque.getLast());
        System.out.println("PeekLast: " + deque.peekLast());
        System.out.println("RemoveFirst: " + deque.removeFirst());
        System.out.println(deque);
        System.out.println("RemoveLast: " + deque.removeLast());
        System.out.println(deque);
        System.out.println("PollFirst: " + deque.pollFirst());
        System.out.println(deque);
        System.out.println("PollLast: " + deque.pollLast());
        System.out.println(deque);

    }
}
