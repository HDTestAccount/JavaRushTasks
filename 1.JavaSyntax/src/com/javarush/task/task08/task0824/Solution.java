package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> kids = new ArrayList<>();
        Human kid1 = new Human("Vasya", true, 10, kids);
        System.out.println(kid1);
        Human kid2 = new Human("Vasya1", false, 11, kids);
        System.out.println(kid2);
        Human kid3 = new Human("Vasya1", true, 12, kids);
        System.out.println(kid3);
        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);
        Human pa = new Human("VasyaPa", true, 30, kids);
        System.out.println(pa);
        Human ma = new Human("VasyaMa", false, 31, kids);
        System.out.println(ma);
        kids.clear();
        kids.add(pa);
        Human gPa1 = new Human("VasyaGPa1", true, 60, kids);
        System.out.println(gPa1);
        Human gMa1 = new Human("VasyaGMa1", false, 61, kids);
        System.out.println(gMa1);
        kids.clear();
        kids.add(ma);
        Human gPa2 = new Human("VasyaGPa2", true, 60, kids);
        System.out.println(gPa2);
        Human gMa2 = new Human("VasyaGMa2", false, 61, kids);
        System.out.println(gMa2);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
