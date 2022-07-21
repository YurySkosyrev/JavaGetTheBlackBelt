package com.javacourse.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Sergey");
        queue.add("Pavel");
        queue.add("Maria");
        queue.add("Aleks");

//        add without exception
        queue.offer("Semen");

        System.out.println(queue);
        System.out.println("Deleted element: "+ queue.remove());
        System.out.println(queue);

//        remove without exception
//        queue.poll();

        System.out.println("The first element of queue: " + queue.element());

//        Get the first element without exception
//        queue.peek();

        queue.remove("Aleks");
        System.out.println("Deleting element from the middle: ");
    }

}
