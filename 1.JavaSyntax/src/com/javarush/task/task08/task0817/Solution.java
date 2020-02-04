package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            String name = pair.getValue();
            int counter = 0;
            for (Map.Entry<String, String> pair1 : copy.entrySet()) {
                if (pair1.getValue().equals(name)) {
                    counter++;
                }
            }
            if (counter > 1)
                removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
