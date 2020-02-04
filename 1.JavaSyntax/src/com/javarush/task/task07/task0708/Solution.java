package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        int listLength = 5;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>(listLength);
        for (int i = 0; i < listLength; i++) {
            strings.add(br.readLine());
        }
        int len = 0;
        for (int i = 0; i < listLength; i++) {
            if (strings.get(i).length() > len) {
                len = strings.get(i).length();
            }
        }
        for (int i = 0; i < listLength; i++) {
            if (strings.get(i).length() == len) {
                System.out.println(strings.get(i));
            }
        }
    }
}