package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = br.readLine();
        String fName2 = br.readLine();
        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(fName1)));
        BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fName2)));
        int key;
        Long counter = 1L;
        Map<Integer, Long> map = new TreeMap<>();
        while (fr.ready()) {
            key = fr.read();
            map.computeIfPresent(key, (k, v) -> v += 1);
            map.computeIfAbsent(key, k -> 1L);
        }


        while (true) {

        }


    }
}
