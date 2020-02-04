package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {
            while (true) {
                list.add(Integer.parseInt(br.readLine()));
            }
        } catch (IOException | NumberFormatException e) {
        } finally {
            for (Integer i : list) {
                System.out.println(i);
            }
        }
    }
}
