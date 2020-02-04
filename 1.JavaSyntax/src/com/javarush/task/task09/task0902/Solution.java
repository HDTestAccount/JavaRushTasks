package com.javarush.task.task09.task0902;

/*
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] sTrace = Thread.currentThread().getStackTrace();
        return sTrace[2].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] sTrace = Thread.currentThread().getStackTrace();
        return sTrace[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] sTrace = Thread.currentThread().getStackTrace();
        return sTrace[2].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] sTrace = Thread.currentThread().getStackTrace();
        return sTrace[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] sTrace = Thread.currentThread().getStackTrace();
//        System.out.println(sTrace[2].getMethodName());
        return sTrace[2].getMethodName();
    }
}
