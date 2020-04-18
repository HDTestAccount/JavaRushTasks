package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

        String fName1 = is.readLine();
        String fName2 = is.readLine();
        BufferedReader fis = new BufferedReader(new InputStreamReader(new FileInputStream(fName1)));
        while (fis.ready()) {
            allLines.add(fis.readLine());
        }
        fis.close();
        fis = new BufferedReader(new InputStreamReader(new FileInputStream(fName2)));
        while (fis.ready()) {
            forRemoveLines.add(fis.readLine());
        }
        fis.close();
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Corrupt");
        }

    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
