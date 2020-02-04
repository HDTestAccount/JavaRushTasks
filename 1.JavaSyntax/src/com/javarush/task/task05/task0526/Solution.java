package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {

    public static void main(String[] args) {
        Man man1 = new Man("Vasya", 15, "Moscow");
        System.out.println(man1);
        Man man2 = new Man("Vasya1", 151, "Moscow1");
        System.out.println(man2);
        Woman woman1 = new Woman("Tanya", 152, "Moscow2");
        System.out.println(woman1);
        Woman woman2 = new Woman("Tanya1", 153, "Moscow3");
        System.out.println(woman2);

    }

    public static class Man {
        public String name, address;
        public int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        public String name, address;
        public int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

}