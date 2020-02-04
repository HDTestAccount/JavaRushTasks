package com.javarush.task.task04.task0417;                                                                                                    
                                                                                                    
/*                                                                                                     
Существует ли пара?                                                                                                    
*/                                                                                                    
                                                                                                    
import java.io.*;                                                                                                    
import java.util.*;                                                                                                    
                                                                                                    
public class Solution {                                                                                                    
    public static void main(String[] args) throws Exception {                                                                                                    
        //напишите тут ваш код                                                                                                    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                                                  
        int a, b, c;                                                  
        a = Integer.parseInt(br.readLine());                                                  
        b = Integer.parseInt(br.readLine());                                                  
        c = Integer.parseInt(br.readLine());                                                  
        if (a == b && a == c) {                                                  
            System.out.println(a + " " + a + " " + a);                                                  
        } else if (a == b || a == c) {                                                  
            System.out.println(a + " " + a);                                                  
        } else if (b == c) {                                                  
            System.out.println(b + " " + b);                                                  
        }                                                                                                  
    }                                                                                                    
}