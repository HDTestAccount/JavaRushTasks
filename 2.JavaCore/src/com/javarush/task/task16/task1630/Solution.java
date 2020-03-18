package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        firstFileName = "/home/test/Downloads/file1.txt";
        secondFileName = "/home/test/Downloads/file2.txt";
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread implements ReadFileInterface, Runnable {
        String fileName;
        String fileContent = new String();

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }

        @Override
        public void join() throws InterruptedException {

        }

        @Override
        public void start() {
            run();
        }

        @Override
        public void run() {
            StringBuilder fileContentBuffer = new StringBuilder();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
                while (bufferedReader.ready()) {
                    fileContentBuffer.append(bufferedReader.readLine() + "\n");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            fileContent = fileContentBuffer.toString();
        }
    }
}
