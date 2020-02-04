package com.javarush.task.task04.task0421;                                                                                                    
                                                                                                    
/*                                                                                                     
Настя или Настя?                                                                                                    
*/                                                                                                    
                                                                                                    
import java.io.*;                                                                                                    
import java.util.*;                                                                                                    
                                                                                                    
public class Solution {                                                                                                    
    public static void main(String[] args) throws Exception {                                                                                                    
        //напишите тут ваш код                                                                                                    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1, name2, outputVar = "0";
        name1 = br.readLine();
        name2 = br.readLine();
        if (name1.equals(name2)) {
            outputVar = "Имена идентичны";
        } else if (name1.length() == name2.length()) {
            outputVar = "Длины имен равны";
        }
        if (!outputVar.equals("0")) {
            System.out.println(outputVar);
        }                                                                                                 
    }                                                                                                    
}