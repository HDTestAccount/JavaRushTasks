package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = br.readLine();
        String fName2 = br.readLine();
        FileInputStream inFile = new FileInputStream(fName1);

        int count = 0;
        List<Byte> file1Content = new ArrayList<>();
        List<Byte> file2Content = new ArrayList<>();
        byte[] bytes = new byte[1000];
        while (inFile.available() > 0) {
            count = inFile.read(bytes);
            for (int i = 0; i < count; i++) {
                file1Content.add(bytes[i]);
            }
        }
        inFile.close();
        FileOutputStream outFile = new FileOutputStream(fName1);
        inFile = new FileInputStream(fName2);
        while (inFile.available() > 0) {
            count = inFile.read(bytes);
            outFile.write(bytes, 0, count);
        }
        for (int i = 0; i < file1Content.size(); i++) {
            outFile.write(file1Content.get(i));
        }
        inFile.close();
        outFile.close();

    }
}
