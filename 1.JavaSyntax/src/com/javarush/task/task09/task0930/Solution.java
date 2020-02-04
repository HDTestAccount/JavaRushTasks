package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        isGreaterThan(array[0], array[0]);
        isNumber(array[0]);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String i : array) {
            try {
                integerArrayList.add(Integer.parseInt(i));
            } catch (NumberFormatException e) {
                stringArrayList.add(i);
            }
        }
        integerArrayList.sort(Comparator.reverseOrder());
        Iterator<Integer> integerIterator = integerArrayList.iterator();
        stringArrayList.sort(Comparator.naturalOrder());
        Iterator<String> stringIterator = stringArrayList.iterator();
        for (int i = 0; i < array.length; i++) {
            try {
                Integer.parseInt(array[i]);
                array[i] = "" + integerIterator.next();
            } catch (NumberFormatException e) {
                array[i] = stringIterator.next();
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
