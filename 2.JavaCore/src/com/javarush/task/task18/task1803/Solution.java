package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Long> bytes = new HashMap();
        Long b = -10L;
        String fName1 = is.readLine();
        FileInputStream fis = new FileInputStream(fName1);
//        FileInputStream fis = new FileInputStream("c:\\temp\\1");
        while (fis.available() >= 1) {
            int key = fis.read();
            bytes.computeIfPresent(key, (k, v) -> v += 1);
            bytes.computeIfAbsent(key, k -> 1L);
        }
//        System.out.println(bytes.size());
        for (Long vls : bytes.values()) {
            if (b < vls) {
                b = vls;
            }
        }
        for (Map.Entry<Integer, Long> vls : bytes.entrySet()) {
            if (b.equals(vls.getValue())) {
                System.out.print(vls.getKey() + " ");
            }
        }
        fis.close();
    }
}
