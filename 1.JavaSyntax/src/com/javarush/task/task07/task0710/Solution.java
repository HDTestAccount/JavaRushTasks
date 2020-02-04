package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int listLength = 10;
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listLength; i++) {
            strings.add(0, br.readLine());
        }

        for (int i = 0; i < listLength; i++) {
            System.out.println(strings.get(i));
        }
    }
}