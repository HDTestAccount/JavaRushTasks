package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int listLength = 10, lenMax, lenMin;
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listLength; i++) {
            strings.add(br.readLine());
        }

        lenMax = 0;
        lenMin = 0;
        for (int i = 0; i < listLength; i++) {
            if (strings.get(i).length() < strings.get(lenMin).length()) {
                lenMin = i;
            }
            if (strings.get(i).length() > strings.get(lenMax).length()) {
                lenMax = i;
            }
        }
        int currIndex = lenMax < lenMin ? lenMax : lenMin;
        System.out.println(strings.get(currIndex));

    }
}
