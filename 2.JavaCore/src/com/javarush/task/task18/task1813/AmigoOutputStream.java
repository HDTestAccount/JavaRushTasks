package com.javarush.task.task18.task1813;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(String aaa) throws IOException {
        super(aaa);
    }

    public void close() throws IOException {
        super.flush();
        super.write("JavaRush © All rights reserved.".getBytes());
        super.close();
    }

    public static void main(String[] args) throws IOException {
        AmigoOutputStream eee = new AmigoOutputStream(fileName);
        eee.write(44);
        eee.close();
    }

}
