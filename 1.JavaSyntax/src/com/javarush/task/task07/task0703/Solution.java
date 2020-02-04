package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] sArr = new String[10];
        int[] iArr = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            sArr[i] = br.readLine();
            iArr[i] = sArr[i].length();
        }
        for (int i : iArr) {
            System.out.println(i);
        }

    }
}
