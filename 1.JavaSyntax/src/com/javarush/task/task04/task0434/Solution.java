package com.javarush.task.task04.task0434;                                                  
                                                  
/*                                                   
Таблица умножения                                                  
*/                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) {                                                  
        //напишите тут ваш код                                                  
      int i=1, j=1;
      while (i<11){
           while (j<11){
                System.out.print((i*j)+" ");
                j++;
           }
           i++;
           j=1;
           System.out.println();
      }                                            
    }                                                  
}