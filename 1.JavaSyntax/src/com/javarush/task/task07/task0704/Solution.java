package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(intArr[i]);

        }
    }
}

