package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conBR = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = conBR.readLine();
            try (FileInputStream fis = new FileInputStream(fileName);) {
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}
