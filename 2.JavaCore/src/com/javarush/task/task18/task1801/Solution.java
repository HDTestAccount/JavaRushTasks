package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        String fName1 = is.readLine();
        FileInputStream fis = new FileInputStream(fName1);
        while (fis.available() > 1) {
            int t = fis.read();
            if (t > b) {
                b = t;
            }
        }
        fis.close();
        System.out.println(b);
    }
}
//c:\temp\1