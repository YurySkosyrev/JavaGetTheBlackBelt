package com.javacourse.scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int i = scanner.nextInt();
//        System.out.println("Your enter is: " + i);

//        String s = scanner.nextLine();
//        System.out.println(s);

//        String s = scanner.next();
//        System.out.println(s);

//        Scanner scanner = new Scanner("Hi how are you?");
//        while(scanner.hasNext()){
//            System.out.println(scanner.next());
//        }

        Scanner scanner = new Scanner("Hi how are you?\n" +
                "Hi I am fine");
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
