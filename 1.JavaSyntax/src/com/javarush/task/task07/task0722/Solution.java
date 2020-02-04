package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmpVal;
        while (true) {
            tmpVal = br.readLine();
            if (tmpVal.equals("end")) break;
            strings.add(tmpVal);
        }

        for (String str : strings) {
            System.out.println(str);
        }

    }
}