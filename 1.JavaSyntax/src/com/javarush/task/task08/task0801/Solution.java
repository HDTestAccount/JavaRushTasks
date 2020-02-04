package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(10);
        String[] stArr = new String[]{"арбуз",
                "банан", "вишня", "груша", "дыня", "ежевика", "женьшень", "земляника", "ирис", "картофель"};
        set.addAll(Arrays.asList(stArr));
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
//            Set tmp = iter.next();
            System.out.println(iter.next());
        }
    }
}
