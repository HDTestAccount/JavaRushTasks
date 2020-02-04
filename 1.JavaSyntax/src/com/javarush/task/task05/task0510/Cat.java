package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    String color, name, address;
    int age, weight;

    public static void main(String[] args) {

    }

    //Имя
    public void initialize(String name) {
        this.name = name;
        this.color = "brown";
        this.address = null;
        this.weight = 15;
        this.age = 5;
    }

    //    Имя, вес, возраст
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.color = "brown";
        this.address = null;
        this.weight = weight;
        this.age = age;
    }

    //    Имя, возраст (вес стандартный)
    public void initialize(String name, int age) {
        this.name = name;
        this.color = "brown";
        this.address = null;
        this.weight = 15;
        this.age = age;
    }

    //    вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize(int weight, String color) {
        this.name = null;
        this.color = color;
        this.address = null;
        this.weight = weight;
        this.age = 5;
    }

    //    вес, цвет, адрес (чужой домашний кот)
    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.color = color;
        this.address = address;
        this.weight = weight;
        this.age = 5;
    }

}
