package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        int listLength = 5;
        ArrayList<String> strings = new ArrayList<>(listLength);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listLength; i++) {
            strings.add(br.readLine());
        }
        int len = strings.get(0).length();
        for (int i = 0; i < listLength; i++) {
            if (strings.get(i).length() < len) {
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
