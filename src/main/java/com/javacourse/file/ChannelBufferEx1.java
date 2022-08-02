package com.javacourse.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("text1", "rw");
            FileChannel channel = file.getChannel()){

            ByteBuffer buffer = ByteBuffer.allocate(25);

            StringBuilder result = new StringBuilder();
            int byteRead = channel.read(buffer);

            while (byteRead > 0){

                System.out.println("byteRead " + byteRead);

                buffer.flip();
                while(buffer.hasRemaining()){
                    result.append((char)buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }

            System.out.println(result);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
