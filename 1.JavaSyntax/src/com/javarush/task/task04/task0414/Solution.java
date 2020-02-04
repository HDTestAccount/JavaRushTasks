package com.javarush.task.task04.task0414;                                                  
                                                  
/*                                                   
Количество дней в году                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код  
          int year = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int days = 0;
        if (year % 400 == 0) {
            days = 366;
        } else if (year % 100 == 0) {
            days = 365;
        } else if (year % 4 == 0) {
            days = 366;
        } else days = 365;
        System.out.printf("количество дней в году: %d",days);                                     
                                                  
    }                                                  
}