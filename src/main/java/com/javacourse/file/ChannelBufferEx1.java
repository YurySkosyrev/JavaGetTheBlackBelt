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

            String addText = "\nTwo roads diverged in a yellow wood,\n" +
                    "And sorry I could not travel both\n" +
                    "And be one traveler, long I stood\n" +
                    "And looked down one as far as I could\n" +
                    "To where it bent in the undergrowth.";

            ByteBuffer buffer1 = ByteBuffer.wrap(addText.getBytes());
            channel.write(buffer1);

//            ByteBuffer buffer2 = ByteBuffer.allocate(addText.getBytes().length);
//            buffer2.put(addText.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
