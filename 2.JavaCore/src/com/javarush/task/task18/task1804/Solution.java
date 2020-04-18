package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> bytes = new HashMap();

        String fName1 = is.readLine();
        FileInputStream fis = new FileInputStream(fName1);
        int key = 0;
        while (fis.available() >= 1) {
            key = fis.read();
            bytes.computeIfPresent(key, (k, v) -> v += 1);
            bytes.computeIfAbsent(key, k -> 1);
        }
        Integer b = key;
        for (Integer vls : bytes.values()) {
            if (b > vls) {
                b = vls;
            }
        }
        for (Map.Entry<Integer, Integer> vls : bytes.entrySet()) {
            if (b.equals(vls.getValue())) {
                System.out.print(vls.getKey() + " ");
            }
        }
        fis.close();
    }
}
