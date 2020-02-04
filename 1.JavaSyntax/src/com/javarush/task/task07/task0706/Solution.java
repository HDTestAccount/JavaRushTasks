package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] houses = new int[15];
        int sumChet = 0, sumNeChet = 0;
        for (int i = 0; i < 15; i++) {
            houses[i] = Integer.parseInt(br.readLine());
            if (i % 2 == 0) sumChet += houses[i];
            else sumNeChet += houses[i];
        }
        if (sumChet > sumNeChet) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
