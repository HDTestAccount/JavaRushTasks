package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int min = 0, max = 0;
        try {
            min = Integer.parseInt(bufferedReader.readLine());
            max = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
        }
        if (min <= 0 || max <= 0) {
            throw new Exception();
        }
        int t = min < max ? min : max, nod = 0;
        for (int i = 1; i <= t; i++) {
            nod = (min % i == 0 && max % i == 0) ? i : nod;
        }
        if (nod != 0) {
            System.out.println(nod);
        }


    }
}
