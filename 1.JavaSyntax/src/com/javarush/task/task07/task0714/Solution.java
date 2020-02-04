package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int listLength = 5, lenMax, lenMin;
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listLength; i++) {
            strings.add(br.readLine());
        }
        strings.remove(2);
        listLength = strings.size();
        for (int i = listLength - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }
}
