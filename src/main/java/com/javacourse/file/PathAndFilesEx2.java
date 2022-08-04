package com.javacourse.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("text3.txt");
        Path directoryPath = Paths.get("C:\\Users\\User\\Desktop\\M");
        Path directoryBPath = Paths.get("C:\\Users\\User\\Desktop\\B");

//        Files.copy(filePath, directoryPath.resolve(filePath));
//        Files.copy(filePath, directoryPath.resolve("test6.txt"));
//        Files.copy(filePath, directoryPath.resolve("test6.txt")
//                , StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(directoryBPath, directoryPath.resolve("B"));

//        Files.move(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);

//        Rename file
//        Files.move(Paths.get("text1"), Paths.get("text11"));

        Files.delete(Paths.get("text4.txt"));

        System.out.println("Done");
    }

}
