package com.javarush.task.task04.task0416;                                                  
                                                  
/*                                                   
Переходим дорогу вслепую                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код                                                  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //=br.readLine();

        double a1 = Double.parseDouble(br.readLine());
        int i = (int) a1 / 5;
        double color = a1 - i * 5;
        if (color >= 0 && color < 3)
            System.out.printf("зелёный");
        if (color >= 3 && color < 4)
            System.out.printf("жёлтый");
        if (color >= 4 && color < 5)
            System.out.printf("красный");                                                 
    }                                                  
}