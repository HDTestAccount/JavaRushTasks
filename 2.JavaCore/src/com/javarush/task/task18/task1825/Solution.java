package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import javafx.collections.transformation.SortedList;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> fileNamesList = new ArrayList<>();
        BufferedReader conBR = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = conBR.readLine();
            if (fileName.equals("end")) {
                break;
            }
            fileNamesList.add(fileName);
        }
//        List<> fileNamesList1 = new SortedList<String>(fileNamesList);
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String o1, String o2) {
                String[] arr1 = o1.split("\\.");
                int num1 = Integer.parseInt(arr1[arr1.length - 1].substring(4));
                arr1 = o2.split("\\.");
                int num2 = Integer.parseInt(arr1[arr1.length - 1].substring(4));
                return num1-num2;
            }
        };

        Collections.sort(fileNamesList, comparator);


        String resultFilename = fileNamesList.get(0).substring(0, fileNamesList.get(0).length() - 6);
        FileOutputStream fos = new FileOutputStream(resultFilename);
        byte[] bytes = new byte[1000];
        for (String inputFile : fileNamesList) {
            FileInputStream fis = new FileInputStream(inputFile);
            int countRead;
            while (fis.available() > 0) {
                countRead = fis.read(bytes);
                fos.write(bytes, 0, countRead);
            }
            fis.close();
        }
        fos.close();
    }


}
