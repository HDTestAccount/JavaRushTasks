package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        int listLength = 3, lenMax, lenMin;
        ArrayList<String> strings = new ArrayList<>();

        Collections.addAll(strings, "мама", "мыла", "раму");
        strings.add(3, "именно");
        strings.add(2, "именно");
        strings.add(1, "именно");

        for (String tmpVal : strings) {
            System.out.println(tmpVal);
        }

    }
}
