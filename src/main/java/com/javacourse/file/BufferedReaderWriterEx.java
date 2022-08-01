package com.javacourse.file;

import java.io.*;

public class BufferedReaderWriterEx {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("text1"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("text2"))){

//            int character;
//            while ((character=reader.read())!=-1) {
//                writer.write(character);
//            }

            String line;
            while ((line=reader.readLine())!=null){
                writer.write(line + "\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
