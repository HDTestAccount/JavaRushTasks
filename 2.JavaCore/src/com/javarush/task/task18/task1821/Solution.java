package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> charMap = new TreeMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));

        while (br.ready()) {
            int line = br.read();
            charMap.computeIfPresent((char) line, (k, v) -> v + 1);
            charMap.computeIfAbsent((char) line, (k) -> 1);
        }
        br.close();
        for (Map.Entry<Character, Integer> entr : charMap.entrySet()) {
//            System.out.println((byte) entr.getKey().charValue() + " " + entr.getKey() + " " + entr.getValue());
            System.out.println(entr.getKey() + " " + entr.getValue());
        }
    }
}
