package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int listLength = Integer.parseInt(br.readLine());
        int countRoMove = Integer.parseInt(br.readLine());
        for (int i = 0; i < listLength; i++) {
            strings.add(br.readLine());
        }

        for (int i = 0; i < countRoMove; i++) {
            strings.add(strings.remove(0));
        }
        for (int i = 0; i < listLength; i++) {
            System.out.println(strings.get(i));
        }
    }
}
