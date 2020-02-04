package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] longArr = new int[20];
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];
        for (int i = 0; i < 20; i++) {
            longArr[i] = Integer.parseInt(br.readLine());
            if (i < 10) smallArr1[i] = longArr[i];
            else smallArr2[i % 10] = longArr[i];
        }
        for (int i : smallArr2)
            System.out.println(i);
    }
}
