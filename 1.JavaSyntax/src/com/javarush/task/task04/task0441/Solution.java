package com.javarush.task.task04.task0441;                                                  
                                                  
/*                                                   
Как-то средненько                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код                                                  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //=br.readLine();

        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());

        int[] myArr = {a1, a2, a3};

        Arrays.sort(myArr);
        System.out.printf("%d\n", myArr[1]);                                                 
    }                                                  
}