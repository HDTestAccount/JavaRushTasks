package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top, left, width, height;

    public static void main(String[] args) {

    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle rctl) {
        this.top = rctl.top;
        this.left = rctl.left;
        this.width = rctl.width;
        this.height = rctl.height;
    }

    public void initialize() {
        this.top = 0;
        this.left = 0;
        this.width = 0;
        this.height = 0;
    }


}
