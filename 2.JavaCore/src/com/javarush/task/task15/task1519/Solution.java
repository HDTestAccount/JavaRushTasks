package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        while (!input.equals("exit")) {
            if (input.contains(".")) {
                try {
                    print(Double.valueOf(input));
                } catch (NumberFormatException e) {
                    print(input);
                }
            } else {
//                input=input.replaceAll("\\s","");
                String input1 = input.trim();
                try {

                    int i = Integer.parseInt(input1);
                    if (i > 0 && i < 128) {
                        print((short) i);
                    }
                    if (i <= 0 || i >= 128) {
                        print(i);
                    }
                } catch (NumberFormatException e) {
                    print(input);
                }
            }
            input = bufferedReader.readLine();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
