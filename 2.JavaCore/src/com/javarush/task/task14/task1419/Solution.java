package com.javarush.task.task14.task1419;

import com.sun.org.apache.xerces.internal.dom.AbortException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.IncompleteAnnotationException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
        System.out.println(exceptions.size());
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (ArithmeticException e0) {
            exceptions.add(e0);
        }
        try {
            throw new IllegalArgumentException();
        } catch (
                IllegalArgumentException e1) {
            exceptions.add(e1);
        }
        try {
            throw new ArrayStoreException();
        } catch (
                ArrayStoreException e2) {
            exceptions.add(e2);
        }
        try {
            throw new IllegalMonitorStateException();
        } catch (
                IllegalMonitorStateException e3) {
            exceptions.add(e3);
        }
        try {
            throw new NullPointerException();
        } catch (
                NullPointerException e4) {
            exceptions.add(e4);
        }
        try {
            throw new ClassCastException();
        } catch (
                ClassCastException e5) {
            exceptions.add(e5);
        }
        try {
            throw new AbortException();
        } catch (
                AbortException e6) {
            exceptions.add(e6);
        }
        try {
            throw new IndexOutOfBoundsException();
        } catch (
                IndexOutOfBoundsException e7) {
            exceptions.add(e7);
        }
        try {
            throw new NoSuchElementException();
        } catch (
                NoSuchElementException e8) {
            exceptions.add(e8);
        }
        try {
            throw new RuntimeException();
        } catch (
                RuntimeException e9) {
            exceptions.add(e9);
        }
    }
}
