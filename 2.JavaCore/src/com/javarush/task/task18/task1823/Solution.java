package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader conBR = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String inpFile = conBR.readLine();
            if (inpFile.equals("exit")) {
                break;
            }
            new ReadThread(inpFile).start();
        }
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws IOException {
            int[] bytes = new int[256];
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while (br.ready()) {
                int tt = br.read();
                bytes[tt] = bytes[tt] + 1;
            }
            br.close();

            int max = 0;

            for (int i = 1; i < bytes.length; i++) {
                if (bytes[i] > bytes[max]) {
                    max = i;
                }
            }
            resultMap.put(fileName, max);
            System.out.println(max + " " + (char) bytes[max]);
        }
    }
}
