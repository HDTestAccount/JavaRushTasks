package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        LinkedList<String> inputLines = new LinkedList<String>();
        String inputLine;
        String fileName = bufferedReader.readLine();
        do {
            inputLine = bufferedReader.readLine();
            inputLines.add(inputLine);
        } while (!inputLine.equals("exit"));
        inputStreamReader.close();
        File file = new File(fileName);
//        if (!file.exists()) file.createNewFile();
        Writer fileWriter = new FileWriter(fileName, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String tmpLine : inputLines) {
            bufferedWriter.write(tmpLine + "\r\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
