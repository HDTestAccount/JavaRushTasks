package com.javarush.task.task13.task1318;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader cis = new BufferedReader(new InputStreamReader(System.in));
        String fName = cis.readLine();
        cis.close();
        FileInputStream fIs = new FileInputStream(new File(fName));
        BufferedReader fis = new BufferedReader(new InputStreamReader(fIs));

        while (fis.ready()) {
            System.out.println(fis.readLine());
        }

        fIs.close();
    }
}