package com.javacourse.collection.queue.abstractqueue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(4);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(6);
        priorityQueue.add(2);

        System.out.println("Not sorted view: " + priorityQueue);
        System.out.println("Deleted element: " + priorityQueue.remove());
        System.out.println(priorityQueue);
    }
}



