package com.javacourse.collection.list.stack;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Sergey");
        stack.push("Petr");
        stack.push("Maria");
        stack.push("Oleg");

        System.out.println(stack);
        System.out.println(stack.peek()); // don`t remove the element
        System.out.println(stack);

        System.out.println(stack.pop()); // maybe EmptyStackException
        System.out.println(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
