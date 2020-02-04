package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String classs = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodd = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.printf("%s: %s: %s", classs, methodd, s);
        Thread.currentThread().getStackTrace();
    }
}
