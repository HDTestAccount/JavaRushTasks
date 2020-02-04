package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        int lenPosl = 0;
        int counter;

        for (int i = 0; i < list.size(); i++) {
            counter = 1;
            for (int j = i + 1; j < list.size(); j++) {
                int a = list.get(i);
                int b = list.get(j);
                if (a == b) {
                    counter++;
                } else {
                    i = j - 1;
                    break;
                }
            }
            if (lenPosl < counter) lenPosl = counter;
        }
        System.out.println(lenPosl);
    }
}