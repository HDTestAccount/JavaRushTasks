package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> mapa = new HashMap<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            mapa.put("User" + i, rnd.nextInt(1000));
        }
        return mapa;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            if (iter.next().getValue() < 500) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, Integer> testMapa = createMap();
//        System.out.println(testMapa.toString());
//        removeItemFromMap(testMapa);
//        System.out.println(testMapa.toString());
    }
}