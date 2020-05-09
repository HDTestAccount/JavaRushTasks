package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conBR = new BufferedReader(new InputStreamReader(System.in));
        String inpFile = conBR.readLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inpFile)));
        while (br.ready()) {
            String tt = br.readLine();
            if (tt.startsWith(args[0] + " ")) {
                System.out.println(tt);
                br.close();
                break;
            }
        }
    }
}
