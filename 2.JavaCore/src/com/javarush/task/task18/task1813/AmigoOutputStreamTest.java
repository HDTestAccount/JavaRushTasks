package com.javarush.task.task18.task1813;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStreamTest extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream fileOutputStream;

    public AmigoOutputStreamTest(FileOutputStream fos) throws IOException {
        super(fos.getFD());
        this.fileOutputStream  = fos;

    }

    public void write(int b) throws IOException {
        super.write(b);
    }

    public void write(byte[] b) throws IOException {
        super.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        super.write(b, off, len);
    }

    public void close() throws IOException {
        super.flush();
        super.write("JavaRush © All rights reserved.".getBytes());
        super.close();
    }

    public FileChannel getChannel() {
        return super.getChannel();
    }

    public void flush() throws IOException {
        fileOutputStream.flush();
    }


    public static void main(String[] args) throws IOException {
        FileOutputStream eee = new AmigoOutputStreamTest(new FileOutputStream(fileName));
        eee.write(44);
        eee.close();
    }

}
