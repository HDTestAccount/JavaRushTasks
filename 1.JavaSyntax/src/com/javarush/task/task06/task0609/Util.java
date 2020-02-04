package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double xDim = x1 - x2;
        double yDim = y1 - y2;
        double zDim = Math.sqrt(Math.pow(xDim, 2) + Math.pow(yDim, 2));
        return zDim;
    }

    public static void main(String[] args) {
    }
}
