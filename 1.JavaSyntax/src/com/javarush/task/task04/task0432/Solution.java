package com.javarush.task.task04.task0432;                                                  
                                                  
/*                                                   
Хорошего много не бывает                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код                                                  
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
int i = 0;
        count = Integer.parseInt(br.readLine());
        while ( i < count) {
            System.out.println(word);
i++;
        }                                         
    }                                                  
}