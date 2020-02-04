package com.javarush.task.task03.task0319;                                                                                                    
                                                                                                    
/*                                                                                                     
Предсказание на будущее                                                                                                    
*/                                                                                                    
                                                                                                    
import java.io.*;                                                                                                    
import java.util.*;                                                                                                    
                                                                                                    
public class Solution {                                                                                                    
    public static void main(String[] args) throws Exception {                                                                                                    
        //напишите тут ваш код                                                  
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                                                  
String name=br.readLine();                                                  
String num1 = br.readLine();                                                                                    
String num2 = br.readLine();                                                  
System.out.printf("%s получает %s через %s лет.", name, num1, num2);                                                  
                                                                                                    
    }                                                                                                    
}