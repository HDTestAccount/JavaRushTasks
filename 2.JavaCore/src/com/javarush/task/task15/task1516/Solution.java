package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;

    public static void main(String[] args) {
        Solution qwe = new Solution();
        System.out.println(qwe.intVar);
        System.out.println(qwe.doubleVar);
        System.out.println(qwe.DoubleVar);
        System.out.println(qwe.booleanVar);
        System.out.println(qwe.ObjectVar);
        System.out.println(qwe.ExceptionVar);
        System.out.println(qwe.StringVar);
    }
}
