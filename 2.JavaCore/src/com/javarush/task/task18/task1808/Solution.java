package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = is.readLine();
        String fName2 = is.readLine();
        String fName3 = is.readLine();
        FileInputStream fis = new FileInputStream(fName1);

        byte[] buffer = new byte[fis.available()];
        int fileLength = fis.read(buffer);
        int firstPath = fileLength / 2 + fileLength % 2;
        int secondPath = fileLength - firstPath;
        FileOutputStream fos = new FileOutputStream(fName2);
        fos.write(buffer, 0, firstPath);
        fos.flush();
        fos.close();
        fos = new FileOutputStream(fName3);
        fos.write(buffer, firstPath, secondPath);
        fos.flush();
        fos.close();
        fis.close();

    }
}
