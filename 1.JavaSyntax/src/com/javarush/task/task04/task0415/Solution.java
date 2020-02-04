package com.javarush.task.task04.task0415;                                                  
                                                  
/*                                                   
Правило треугольника                                                  
*/                                                  
                                                  
import java.io.*;                                                  
import java.util.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) throws Exception {                                                  
        //напишите тут ваш код                                                  
       int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
int b = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
int c = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
 String answer;
if (a<(b+c)&&b<(a+c)&&c<(a+b)){
answer = "Треугольник существует.";}else{
answer = "Треугольник не существует.";};
System.out.println(answer);              
    }                                                  
}