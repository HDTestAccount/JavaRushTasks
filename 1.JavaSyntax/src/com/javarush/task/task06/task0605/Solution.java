package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {

            double index = weight / (Math.pow(height, 2));
            String result="";
            if (index < 18.5) {
                result = "Недовес: меньше чем 18.5";
            } else if (index >= 18.5 && index < 25) {
                result = "Нормальный: между 18.5 и 25";
            } else if (index >= 25 && index < 30) {
                result = "Избыточный вес: между 25 и 30";
            } else if (index >= 30) {
                result = "Ожирение: 30 или больше";
            }
            System.out.println(result);
        }
    }
}
