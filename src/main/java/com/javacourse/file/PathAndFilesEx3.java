package com.javacourse.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//
//        String addText = "Two roads diverged in a yellow wood,\n" +
//                "And sorry I could not travel both\n" +
//                "And be one traveler, long I stood\n" +
//                "And looked down one as far as I could\n" +
//                "To where it bent in the undergrowth.";
//
//        Files.write(filePath, addText.getBytes(StandardCharsets.UTF_8));

        List<String> list = Files.readAllLines(filePath);

        for (String s : list){
            System.out.println(s);
        }
    }
}
