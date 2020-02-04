package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int tmpVar, result;
        result = Integer.parseInt(reader.readLine());
        for (int i = 0; i < maximum - 1; i++) {
            tmpVar = Integer.parseInt(reader.readLine());
            if (result < tmpVar) {
                result = tmpVar;
            }
        }

        //напишите тут ваш код

        System.out.println(result);
    }
}
