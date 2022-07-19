package com.javacourse.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator();

        boolean isPalindrome = true;

        while(iterator.hasNext() && reverseIterator.hasPrevious()){
            if(iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(s + " is palindrome: " + isPalindrome);
    }
}
