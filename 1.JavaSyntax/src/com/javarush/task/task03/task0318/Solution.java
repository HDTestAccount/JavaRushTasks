package com.javarush.task.task03.task0318;                                                                                                    
                                                                                                    
/*                                                                                                     
План по захвату мира                                                                                                    
*/                                                                                                    
                                                                                                    
import java.io.*;                                                                                                    
import java.util.*;                                                                                                    
                                                                                                    
public class Solution {                                                                                                    
    public static void main(String[] args) throws Exception {                                                                                                    
        //напишите тут ваш код                                                  
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                                                    
                                                  
String years = br.readLine();                                                     
String name = br.readLine();                                                                                             
System.out.printf("%s захватит мир через %s лет. Му-ха-ха!",name, years);                                                                       
    }                                                                                                    
}