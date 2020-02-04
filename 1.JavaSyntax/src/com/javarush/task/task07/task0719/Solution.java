package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int listLength = 10;
        ArrayList<Integer> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listLength; i++) {
            strings.add(Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < listLength; i++) {
            System.out.println(strings.get(listLength-1-i));
        }
    }
}
