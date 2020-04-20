package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(args[0]);
        byte[] inp = new byte[1000];
        int allCount = 0;
        int spaceCount = 0;
        while (is.available() > 0) {
            allCount += is.read(inp);
            spaceCount = spaceCount(inp);
        }
        System.out.printf("%.2f", ((double) spaceCount / allCount * 100));
        is.close();
    }

    private static int spaceCount(byte[] inp) {
        int localCount = 0;
        for (int i = 0; i < inp.length; i++) {
            if (inp[i] == ' ') {
                localCount++;
            }
        }
        return localCount;
    }
}
