package com.javarush.task.task01.task0130;                                                                                                    
                                                                                                    
/*                                                                                                     
Наш первый конвертер!                                                                                                    
*/                                                                                                    
                                                                                                    
public class Solution {                                                                                                    
    public static void main(String[] args) {                                                                                                    
        System.out.println(convertCelsiusToFahrenheit(41));                                                                                                    
    }                                                                                                    
                                                                                                    
    public static double convertCelsiusToFahrenheit(int celsius) {                                                                                                    
        //напишите тут ваш код                                                                                                    
        double TF=9.0/5.0;                                                  
        TF=TF*celsius;                                                  
        TF=TF+32;                                                                                          
        return TF;                                                                                                    
    }                                                                                                    
}