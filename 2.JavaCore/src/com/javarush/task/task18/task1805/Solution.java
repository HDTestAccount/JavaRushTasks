package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> list = new TreeSet<>();
        String fName1 = is.readLine();
        FileInputStream fis = new FileInputStream(fName1);

        while (fis.available() >= 1) {
            list.add(fis.read());
        }
        String ttt = list.toString();
        ttt = ttt.substring(1, ttt.length() - 1);
        ttt = ttt.replaceAll(",", "");
        System.out.println(ttt);
        fis.close();
    }
}
