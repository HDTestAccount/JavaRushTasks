package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Вася");
        map.put("Петров", "Петя");
        map.put("Сидоров", "Дима");
        map.put("Иванов1", "Олег");
        map.put("Петров2", "Вася");
        map.put("Сидоров3", "Петя");
        map.put("Иванов4", "Дима");
        map.put("Петров5", "Олег");
        map.put("Сидоров6", "Вася");
        map.put("Сидоров7", "Петя");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int counter = 0;
        for (String i : map.values()) {
            if (name.equals(i)) counter++;
        }
        return counter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int counter = 0;
        for (String i : map.keySet()) {
            if (lastName.equals(i)) counter++;
        }
        return counter;

    }

    public static void main(String[] args) {
    }
}
