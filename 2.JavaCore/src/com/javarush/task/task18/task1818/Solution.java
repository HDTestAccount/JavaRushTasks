package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = br.readLine();
        String fName2 = br.readLine();
        String fName3 = br.readLine();
        FileInputStream inFile = new FileInputStream(fName2);
        FileOutputStream outFile = new FileOutputStream(fName1);
        int count = 0;
        byte[] bytes = new byte[1000];
        while (inFile.available() > 0) {
            count = inFile.read(bytes);
            outFile.write(bytes, 0, count);
        }
        inFile.close();
        inFile = new FileInputStream(fName3);
        while (inFile.available() > 0) {
            count = inFile.read(bytes);
            outFile.write(bytes, 0, count);
        }
        inFile.close();
        outFile.close();

    }
}
