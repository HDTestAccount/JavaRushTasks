package com.javarush.task.task04.task0427;                                                  
                                                  
/*                                                   
Описываем числа                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код                                                  
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        a = Integer.parseInt(br.readLine());
        if (a < 1 || a > 999) {
            return;
        } else if (a < 10) {
            if (a % 2 == 0) {
                System.out.println("четное однозначное число");
            } else {
                System.out.println("нечетное однозначное число");
            }
        } else if (a < 100) {
            if (a % 2 == 0) {
                System.out.println("четное двузначное число");
            } else {
                System.out.println("нечетное двузначное число");
            }
        } else if (a < 1000) {
            if (a % 2 == 0) {
                System.out.println("четное трехзначное число");
            } else {
                System.out.println("нечетное трехзначное число");
            }
        }                                   
    }                                                  
}