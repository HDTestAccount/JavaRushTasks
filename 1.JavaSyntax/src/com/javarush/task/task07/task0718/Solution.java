package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        int listLength = 10;
        int upperLen = 0;
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listLength; i++) {
            strings.add(br.readLine());
        }
        upperLen = strings.get(0).length();
        for (int i = 0; i < listLength; i++) {
            if (strings.get(i).length() < upperLen) {
                System.out.println(i);
                break;
            }
            upperLen = strings.get(i).length();
        }
    }
}

