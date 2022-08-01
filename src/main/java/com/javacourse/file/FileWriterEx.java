package com.javacourse.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai =
                "Не делай зла — вернется бумерангом,\n" +
                "Не плюй в колодец — будешь воду пить,\n" +
                "Не оскорбляй того, кто ниже рангом,\n" +
                "А вдруг придется, что-нибудь просить.\n";

        FileWriter writer = null;

        try {
            writer = new FileWriter("text1");
//            writer = new FileWriter("text1", true);
            for (int i =0; i<rubai.length(); i++){
                writer.write(rubai.charAt(i));
            }
//            writer.write(rubai);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }

        System.out.println("Done");
    }

}
