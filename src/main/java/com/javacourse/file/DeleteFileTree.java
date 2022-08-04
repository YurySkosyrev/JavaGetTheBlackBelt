package com.javacourse.file;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileTree {
    public static void main(String[] args) throws IOException {

        Path destinationPath = Paths.get("C:\\Users\\User\\Desktop\\CopyX");

        Files.walkFileTree(destinationPath, new myFileVisitor3());
    }
}

class myFileVisitor3 extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        Files.delete(file);
        System.out.println("Delete file: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

        Files.delete(dir);
        System.out.println("Delete directory: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}
