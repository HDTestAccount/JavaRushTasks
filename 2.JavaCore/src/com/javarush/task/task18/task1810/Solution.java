package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis;
        String fName1;
        byte[] buffer = new byte[1000];
        int fileLength;
        do {
            fName1 = br.readLine();
            fis = new FileInputStream(fName1);
            fileLength = fis.read(buffer, 0, 1000);
            fis.close();
            if (fileLength < 1000) {
                throw new DownloadException();
            }
        } while (fileLength == 1000);
    }

    public static class DownloadException extends Exception {

    }
}
