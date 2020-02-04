package com.javarush.task.task04.task0424;                                                  
                                                  
/*                                                   
Три числа                                                  
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
        if (a == b) {
            System.out.println(3);
        } else if (a == c) {
            System.out.println(2);
        } else if (b == c) {
            System.out.println(1);
        }                                                
    }                                                  
}