package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = is.readLine();
        FileInputStream fis = new FileInputStream(fName1);
        int commaCounter = 0;
        while (fis.available() >= 1) {
            if (fis.read() == ',') {
                commaCounter++;
            }
        }
        fis.close();
        System.out.println(commaCounter);
    }
}
