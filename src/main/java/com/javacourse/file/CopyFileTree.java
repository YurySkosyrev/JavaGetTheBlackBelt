package com.javacourse.file;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {

        Path sourcePath = Paths.get("C:\\Users\\User\\Desktop\\X");
        Path destinationPath = Paths.get("C:\\Users\\User\\Desktop\\CopyX");

        Files.walkFileTree(sourcePath,new MyFileVisitor2(sourcePath, destinationPath));
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path>{

    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        Files.copy(dir, destination.resolve(source.relativize(dir)));
        System.out.println("Copy directory: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        Files.copy(file, destination.resolve(source.relativize(file)));
        System.out.println("Copy file: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}
