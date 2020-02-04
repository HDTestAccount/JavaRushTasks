package com.javarush.task.task04.task0423;                                                  
                                                  
/*                                                   
Фейс-контроль                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код                                                  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inValue;
        int age;
        inValue = br.readLine();
        inValue = br.readLine();
        age=Integer.parseInt(inValue);
        if (age>20) {
            System.out.println("И 18-ти достаточно");
        }                                                 
    }                                                  
}