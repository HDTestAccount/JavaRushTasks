package com.javarush.task.task04.task0429;                                                  
                                                  
/*                                                   
Положительные и отрицательные числа                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код                                                  
            int countPlus = 0, countMinus=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (a > 0) countPlus++;
        if (a < 0) countMinus++;
        a = Integer.parseInt(br.readLine());
        if (a > 0) countPlus++;
        if (a < 0) countMinus++;
        a = Integer.parseInt(br.readLine());
        if (a > 0) countPlus++;
        if (a < 0) countMinus++;
        System.out.printf("количество отрицательных чисел: %d, \r\n количество положительных чисел: %d",countMinus, countPlus);                                     
    }                                                  
}