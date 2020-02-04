package com.javarush.task.task04.task0420;                                                  
                                                  
/*                                                   
Сортировка трех чисел                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код 
              int a[] = new int[3], result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        for (int i = 2; i >-1 ; i--) {
            System.out.print(a[i]+" ");
        }
                                          
                                                  
    }                                                  
}