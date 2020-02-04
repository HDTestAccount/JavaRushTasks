package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Функциональности маловато!
word ;	num	;
x	 ;   x	;to map	repeat
x	 ; 	    ;to map	repeat
	 ;   x	;print	stop
	 ;	    ;        stop
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> values = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String num = reader.readLine();
            if (num.isEmpty()) {
                break;
            }
            String name = reader.readLine();
//Если число и слово не пустые бросаем в мапу
            if (!name.isEmpty()) {
                values.put(name, Integer.parseInt(num));
//если слово пустое - выводим число с пробелом после него и стопаем (не теряем значений)
            } else if (name.isEmpty()) {
                System.out.println(num + " ");
                break;
            }
        }
        for (Map.Entry<String, Integer> entrySet : values.entrySet()) {
            System.out.println(entrySet.getValue() + " " + entrySet.getKey());
        }
    }
}
