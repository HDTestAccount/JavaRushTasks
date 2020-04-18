package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        int b;
        String fName1 = is.readLine();
        FileInputStream fis = new FileInputStream(fName1);
        if (fis.available() > 1) {
            b = fis.read();
            while (fis.available() > 1) {
                int t = fis.read();
                if (t < b) {
                    b = t;
                }
            }
            System.out.println(b);
        }
        fis.close();
    }
}
