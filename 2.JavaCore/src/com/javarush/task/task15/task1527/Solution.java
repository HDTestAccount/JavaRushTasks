package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String url = bufferedReader.readLine();
        String delmiter = "(\\?)";
        String paramSection = url.split(delmiter)[1];
        String[] paramList = paramSection.split("&");
        for (String theParam : paramList) {
            System.out.print(theParam.split("=")[0]+" ");
        }
        for (String theParam : paramList) {
            if (theParam.split("=")[0].equals("obj")) {
                try {
                    alert((double) Double.parseDouble(theParam.split("=")[1]));
                } catch (NumberFormatException e) {
                    alert(theParam.split("=")[1]);
                }
            }
            ;
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
