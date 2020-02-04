package com.javarush.task.task04.task0412;                                                  
                                                  
/*                                                   
Положительное и отрицательное число                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код                                                  
             int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
if (num<0) {num+=1;} 
else if (num >0){num*=2;}
System.out.println(num);
                                            
    }                                                  
                                                  
}