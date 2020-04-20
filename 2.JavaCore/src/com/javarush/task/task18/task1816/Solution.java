package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(args[0]);
        byte[] inp = new byte[1000];
        int lettersCount = 0;
        while (is.available() > 0) {
            is.read(inp);
            lettersCount += calcLettrs(inp);
        }
        System.out.println(lettersCount);
        is.close();
    }

    private static int calcLettrs(byte[] inp) {
        int localCount = 0;
        for (int i = 0; i < inp.length; i++) {

            if ((inp[i] > 64 && inp[i] < 91) || (inp[i] > 96 && inp[i] < 123)) {
                localCount++;
            }
        }
        return localCount;
    }

}
