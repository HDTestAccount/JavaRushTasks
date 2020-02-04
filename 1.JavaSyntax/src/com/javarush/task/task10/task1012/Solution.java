package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        char[] alphabet = {
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Map<String, Integer> alphMapa = new HashMap<>();
        for (Character i : alphabet) {
            alphMapa.put(String.valueOf(i), 0);
        }
        // Ввод строк
        String s = "";
        int counter;
        char[] inpString;
        for (int i = 0; i < 10; i++) {
            s += reader.readLine();
        }
        inpString = s.toCharArray();
        for (int i = 0; i < alphabet.length; i++) {
            counter = 0;
            for (int j = 0; j < inpString.length; j++) {
                if (alphabet[i] == inpString[j]) {
                    counter++;
                }
            }
            System.out.println(alphabet[i] + " " + counter);
        }
    }
}
