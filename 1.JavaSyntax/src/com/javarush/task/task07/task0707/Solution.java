package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.Collections;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        Collections.addAll(list, "1", "2", "3", "4", "5");

        System.out.println(list.size());

        for (String tmpList : list) {
            System.out.println(tmpList);
        }
    }
}
