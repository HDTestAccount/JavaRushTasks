package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] resString = string.split("\\s");
        String result = "";
        for (int i = 0; i < resString.length; i++) {
            String tmp = resString[i];
            String tmp1 = resString[i].toUpperCase();
            if (resString[i].length()>1) {
                resString[i] = tmp1.substring(0, 1) + tmp.substring(1);
            }else if (resString[i].length()==1){
                resString[i] = tmp1.substring(0);
            }
            result += resString[i];
            result += " ";
        }

        System.out.println(result.substring(0, result.length() - 1));//напишите тут ваш код
    }
}
