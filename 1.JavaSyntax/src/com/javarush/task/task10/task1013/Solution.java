package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String name;
        private String surname;
        private String city;
        private boolean sex, children;

        public Human(String name, String surname, String city) {
            this.name = name;
            this.surname = surname;
            this.city = city;
        }
        public Human(int age, boolean sex, boolean children) {
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(boolean sex, boolean children) {
            this.sex = sex;
            this.children = children;
        }

        public Human(int age, String name, String surname, String city, boolean sex, boolean children) {
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.city = city;
            this.sex = sex;
            this.children = children;
        }

        public Human(int age, String name, String surname, String city, boolean sex) {
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.city = city;
            this.sex = sex;
        }

        public Human(int age, String name, String surname, String city) {
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.city = city;
        }

        public Human(int age, String name, String surname) {
            this.age = age;
            this.name = name;
            this.surname = surname;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
