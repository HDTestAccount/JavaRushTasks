package com.javarush.task.task04.task0428;                                                  
                                                  
/*                                                   
Положительное число                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код                                                  
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (a > 0) count++;
        a = Integer.parseInt(br.readLine());
        if (a > 0) count++;
        a = Integer.parseInt(br.readLine());
        if (a > 0) count++;
        System.out.println(count);                                         
    }                                                  
}