package com.javarush.task.task18.task1809;

/*
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = br.readLine();
        String fName2 = br.readLine();

        FileInputStream fis = new FileInputStream(fName1);

        byte[] buffer = new byte[fis.available()];
        int fileLength = fis.read(buffer);
        for (int i = 0; i < fileLength / 2; i++) {
            byte t = buffer[i];
            buffer[i] = buffer[fileLength - i - 1];
            buffer[fileLength - i - 1] = t;
        }
        FileOutputStream fos = new FileOutputStream(fName2);
        fis.close();
        fos.write(buffer, 0, fileLength);
        fos.flush();
        fos.close();
    }
}
