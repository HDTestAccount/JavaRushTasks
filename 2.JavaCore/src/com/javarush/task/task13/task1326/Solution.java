package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        List<Integer> ints = new ArrayList<>();
        Integer i;
        do {
            i = Integer.parseInt(bufferedReader.readLine());
            if (i % 2 == 0) {
                ints.add(i);
            }
        } while (bufferedReader.ready());
        fileInputStream.close();
        Collections.sort(ints);
        for (Integer j : ints) {
            System.out.println(j);
        }
    }
}
