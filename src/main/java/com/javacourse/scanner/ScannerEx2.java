package com.javacourse.scanner;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerEx2 {
    public static void main(String[] args) {

        Set<String> words = new TreeSet<>();

        try(Scanner scanner = new Scanner(new FileReader(new File("Files\\text2"), StandardCharsets.UTF_8))){
            scanner.useDelimiter("\\P{L}+");
            while (scanner.hasNext()){
                words.add(scanner.next());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String s : words){
            System.out.println(s);
        }
    }
}
