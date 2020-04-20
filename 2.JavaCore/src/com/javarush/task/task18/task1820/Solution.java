package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = br.readLine();
        String fName2 = br.readLine();
        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(fName1)));
        BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fName2)));

        String inputLine = fr.readLine();
        String doubles[] = inputLine.split("[\\s]+");

        for (int i = 0; i < doubles.length; i++) {
            fw.write(Math.round(Double.parseDouble(doubles[i])) + " ");
        }

        fr.close();
        fw.flush();
        fw.close();
    }
}
