package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iter = cats.iterator();
        iter.next();
        iter.remove();
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            catSet.add(new Cat());
        }
        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> iter = cats.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }

    public static class Cat {
    }
}
