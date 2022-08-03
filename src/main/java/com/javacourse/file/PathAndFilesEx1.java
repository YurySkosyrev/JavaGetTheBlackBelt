package com.javacourse.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import static java.nio.file.Files.readAttributes;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("text3");
        Path directoryPath = Paths.get("C:\\Users\\Юрий\\Desktop\\N");

        System.out.println("filePath.getFileName(): " + filePath.getFileName());
        System.out.println("directoryPath.getFileName(): " + directoryPath.getFileName());
        System.out.println("--------------------------------------------");

        System.out.println("filePath.getParent(): " + filePath.getParent());
        System.out.println("directoryPath.getParent(): " + directoryPath.getParent());
        System.out.println("--------------------------------------------");

        System.out.println("filePath.getRoot(): " + filePath.getRoot());
        System.out.println("directoryPath.getRoot(): " + directoryPath.getRoot());
        System.out.println("--------------------------------------------");

        System.out.println("filePath.isAbsolute(): " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute(): " + directoryPath.isAbsolute());
        System.out.println("--------------------------------------------");

        System.out.println("filePath.toAbsolutePath(): " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath(): " + directoryPath.toAbsolutePath());
        System.out.println("--------------------------------------------");

        System.out.println("filePath.toAbsolutePath().getParent(): " + filePath.toAbsolutePath().getParent());
        System.out.println("filePath.toAbsolutePath().getRoot(): " + filePath.toAbsolutePath().getRoot());
        System.out.println("--------------------------------------------");

        System.out.println("directoryPath.resolve(filePath): " + directoryPath.resolve(filePath));
        Path anotherPath = Paths.get("C:\\Users\\Юрий\\Desktop\\M\\N\\test.txt");
        System.out.println("directoryPath.relativize(anotherPath): " + directoryPath.relativize(anotherPath));
        System.out.println("--------------------------------------------");

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }

        if(!Files.exists(directoryPath)){
            Files.createDirectory(directoryPath);
        }

        System.out.println("Files.isReadable(filePath): " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath): " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath): " + Files.isExecutable(filePath));
        System.out.println("--------------------------------------------");

        Path filePath1 = Paths.get("C:\\Java\\JavaGetTheBlackBeltUdemy\\text3");

        System.out.println("Files.isSameFile(filePath, filePath1): " + Files.isSameFile(filePath, filePath1));
        System.out.println(Files.size(filePath));
        System.out.println(Files.getAttribute(filePath, "creationTime"));


        Map<String, Object> map = Files.readAttributes(filePath,"*");
        for(Map.Entry<String, Object> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
